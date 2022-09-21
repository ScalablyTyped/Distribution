package typings.twilio

import typings.twilio.interfacesMod.SerializableClass
import typings.twilio.pageMod.TwilioResponsePayload
import typings.twilio.twilioStrings.`form-push`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formMod {
  
  @JSImport("twilio/lib/rest/verify/v2/form", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio/lib/rest/verify/v2/form", "FormContext")
  @js.native
  open class FormContext protected () extends StObject {
    /**
      * Initialize the FormContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param formType - The Type of this Form
      */
    def this(version: typings.twilio.verifyV2Mod.^, formType: FormFormTypes) = this()
    
    /**
      * fetch a FormInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FormInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ FormInstance, Any]): js.Promise[FormInstance] = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  @JSImport("twilio/lib/rest/verify/v2/form", "FormInstance")
  @js.native
  open class FormInstance protected () extends SerializableClass {
    /**
      * Initialize the FormContext
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param payload - The instance payload
      * @param formType - The Type of this Form
      */
    def this(version: typings.twilio.verifyV2Mod.^, payload: FormPayload, formType: FormFormTypes) = this()
    
    /* private */ var _proxy: FormContext = js.native
    
    /**
      * fetch a FormInstance
      *
      * @param callback - Callback to handle processed record
      */
    def fetch(): js.Promise[FormInstance] = js.native
    def fetch(callback: js.Function2[/* error */ js.Error | Null, /* items */ this.type, Any]): js.Promise[FormInstance] = js.native
    
    var formMeta: Any = js.native
    
    var formType: FormFormTypes = js.native
    
    var forms: Any = js.native
    
    var url: String = js.native
  }
  
  /**
    * Initialize the FormList
    *
    * PLEASE NOTE that this class contains beta products that are subject to change.
    * Use them with caution.
    *
    * @param version - Version of the resource
    */
  inline def FormList(version: typings.twilio.verifyV2Mod.^): FormListInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("FormList")(version.asInstanceOf[js.Any]).asInstanceOf[FormListInstance]
  
  @JSImport("twilio/lib/rest/verify/v2/form", "FormPage")
  @js.native
  open class FormPage protected ()
    extends typings.twilio.pageMod.^[typings.twilio.verifyV2Mod.^, FormPayload, FormResource, FormInstance] {
    /**
      * Initialize the FormPage
      *
      * PLEASE NOTE that this class contains beta products that are subject to change.
      * Use them with caution.
      *
      * @param version - Version of the resource
      * @param response - Response from the API
      * @param solution - Path solution
      */
    def this(
      version: typings.twilio.verifyV2Mod.^,
      response: typings.twilio.responseMod.^[String],
      solution: FormSolution
    ) = this()
    
    /**
      * Build an instance of FormInstance
      *
      * @param payload - Payload response from the API
      */
    def getInstance(payload: FormPayload): FormInstance = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  type FormFormTypes = `form-push`
  
  @js.native
  trait FormListInstance extends StObject {
    
    /**
      * @param sid - sid of instance
      */
    def apply(sid: String): FormContext = js.native
    
    /**
      * Constructs a form
      *
      * @param formType - The Type of this Form
      */
    def get(formType: String): FormContext = js.native
    
    /**
      * Provide a user-friendly representation
      */
    def toJSON(): Any = js.native
  }
  
  trait FormPayload
    extends StObject
       with FormResource
       with TwilioResponsePayload
  object FormPayload {
    
    inline def apply(
      first_page_uri: String,
      form_meta: js.Object,
      form_type: FormFormTypes,
      forms: js.Object,
      next_page_uri: String,
      page: Double,
      page_size: Double,
      previous_page_uri: String,
      uri: String,
      url: String
    ): FormPayload = {
      val __obj = js.Dynamic.literal(first_page_uri = first_page_uri.asInstanceOf[js.Any], form_meta = form_meta.asInstanceOf[js.Any], form_type = form_type.asInstanceOf[js.Any], forms = forms.asInstanceOf[js.Any], next_page_uri = next_page_uri.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], page_size = page_size.asInstanceOf[js.Any], previous_page_uri = previous_page_uri.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormPayload]
    }
  }
  
  trait FormResource extends StObject {
    
    var form_meta: js.Object
    
    var form_type: FormFormTypes
    
    var forms: js.Object
    
    var url: String
  }
  object FormResource {
    
    inline def apply(form_meta: js.Object, form_type: FormFormTypes, forms: js.Object, url: String): FormResource = {
      val __obj = js.Dynamic.literal(form_meta = form_meta.asInstanceOf[js.Any], form_type = form_type.asInstanceOf[js.Any], forms = forms.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormResource]
    }
    
    extension [Self <: FormResource](x: Self) {
      
      inline def setForm_meta(value: js.Object): Self = StObject.set(x, "form_meta", value.asInstanceOf[js.Any])
      
      inline def setForm_type(value: FormFormTypes): Self = StObject.set(x, "form_type", value.asInstanceOf[js.Any])
      
      inline def setForms(value: js.Object): Self = StObject.set(x, "forms", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormSolution extends StObject
}
