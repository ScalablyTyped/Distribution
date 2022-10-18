package typings.twilio

import typings.std.Pick
import typings.twilio.twilioStrings.get_
import typings.twilio.twilioStrings.post_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterfacesMod {
  
  @JSImport("twilio/lib/interfaces", "SerializableClass")
  @js.native
  open class SerializableClass () extends StObject {
    
    /**
      * Converts the current instance in a regular JSON.
      * It will be automatically called by JSON.stringify()
      */
    def toJSON(): Json[this.type] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.twilio.twilioStrings.get_
    - typings.twilio.twilioStrings.post_
    - typings.twilio.twilioStrings.put
    - typings.twilio.twilioStrings.patch
    - typings.twilio.twilioStrings.delete
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def delete: typings.twilio.twilioStrings.delete = "delete".asInstanceOf[typings.twilio.twilioStrings.delete]
    
    inline def get: get_ = "get".asInstanceOf[get_]
    
    inline def patch: typings.twilio.twilioStrings.patch = "patch".asInstanceOf[typings.twilio.twilioStrings.patch]
    
    inline def post: post_ = "post".asInstanceOf[post_]
    
    inline def put: typings.twilio.twilioStrings.put = "put".asInstanceOf[typings.twilio.twilioStrings.put]
  }
  
  type Json[T] = NonFunctionProperties[T]
  
  trait ListEachOptions[TInstance] extends StObject {
    
    /**
      * Function to process each record. If this and a positional
      * callback are passed, this one will be used
      */
    var callback: js.UndefOr[
        js.Function2[
          /* item */ TInstance, 
          /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Function to be called upon completion of streaming
      */
    var done: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], Unit]] = js.undefined
    
    /**
      * Upper limit for the number of records to return.
      * each() guarantees never to return more than limit.
      * Default is no limit
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of records to fetch per request,
      * when not set will use the default value of 50 records.
      * If no pageSize is defined but a limit is defined,
      * each() will attempt to read the limit with the most efficient
      * page size, i.e. min(limit, 1000)
      */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ListEachOptions {
    
    inline def apply[TInstance](): ListEachOptions[TInstance] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListEachOptions[TInstance]]
    }
    
    extension [Self <: ListEachOptions[?], TInstance](x: Self & ListEachOptions[TInstance]) {
      
      inline def setCallback(
        value: (/* item */ TInstance, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit
      ): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDone(value: /* err */ js.UndefOr[js.Error] => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  trait ListOptions[TInstance] extends StObject {
    
    /**
      * Callback to handle list of records
      */
    var callback: js.UndefOr[js.Function1[/* items */ js.Array[TInstance], Unit]] = js.undefined
    
    /**
      * Upper limit for the number of records to return.
      * each() guarantees never to return more than limit.
      * Default is no limit
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of records to fetch per request,
      * when not set will use the default value of 50 records.
      * If no pageSize is defined but a limit is defined,
      * each() will attempt to read the limit with the most efficient
      * page size, i.e. min(limit, 1000)
      */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object ListOptions {
    
    inline def apply[TInstance](): ListOptions[TInstance] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOptions[TInstance]]
    }
    
    extension [Self <: ListOptions[?], TInstance](x: Self & ListOptions[TInstance]) {
      
      inline def setCallback(value: /* items */ js.Array[TInstance] => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  type NonFunctionProperties[T] = Pick[T, NonFunctionPropertyNames[T]]
  
  type NonFunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  
  trait PageOptions[TPage] extends StObject {
    
    /**
      * Callback to handle list of records
      */
    var callback: js.UndefOr[js.Function1[/* page */ TPage, Unit]] = js.undefined
    
    /**
      * Page Number, this value is simply for client state
      */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of records to return, defaults to 50
      */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /**
      * PageToken provided by the API
      */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object PageOptions {
    
    inline def apply[TPage](): PageOptions[TPage] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageOptions[TPage]]
    }
    
    extension [Self <: PageOptions[?], TPage](x: Self & PageOptions[TPage]) {
      
      inline def setCallback(value: /* page */ TPage => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  type PhoneNumber = String
  
  trait PhoneNumberCapabilities extends StObject {
    
    var fax: Boolean
    
    var mms: Boolean
    
    var sms: Boolean
    
    var voice: Boolean
  }
  object PhoneNumberCapabilities {
    
    inline def apply(fax: Boolean, mms: Boolean, sms: Boolean, voice: Boolean): PhoneNumberCapabilities = {
      val __obj = js.Dynamic.literal(fax = fax.asInstanceOf[js.Any], mms = mms.asInstanceOf[js.Any], sms = sms.asInstanceOf[js.Any], voice = voice.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneNumberCapabilities]
    }
    
    extension [Self <: PhoneNumberCapabilities](x: Self) {
      
      inline def setFax(value: Boolean): Self = StObject.set(x, "fax", value.asInstanceOf[js.Any])
      
      inline def setMms(value: Boolean): Self = StObject.set(x, "mms", value.asInstanceOf[js.Any])
      
      inline def setSms(value: Boolean): Self = StObject.set(x, "sms", value.asInstanceOf[js.Any])
      
      inline def setVoice(value: Boolean): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
    }
  }
  
  type Sid = String
  
  type Url = String
}
