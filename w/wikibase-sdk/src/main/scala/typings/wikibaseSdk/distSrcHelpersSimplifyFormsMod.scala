package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcTypesLexemeMod.Form
import typings.wikibaseSdk.distSrcTypesLexemeMod.SimplifiedForm
import typings.wikibaseSdk.distSrcTypesSimplifyClaimsMod.SimplifyClaimsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersSimplifyFormsMod {
  
  @JSImport("wikibase-sdk/dist/src/helpers/simplify_forms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def simplifyForm(form: Form): SimplifiedForm = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyForm")(form.asInstanceOf[js.Any]).asInstanceOf[SimplifiedForm]
  inline def simplifyForm(form: Form, options: SimplifyClaimsOptions): SimplifiedForm = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyForm")(form.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SimplifiedForm]
  
  inline def simplifyForms(forms: js.Array[Form]): js.Array[SimplifiedForm] = ^.asInstanceOf[js.Dynamic].applyDynamic("simplifyForms")(forms.asInstanceOf[js.Any]).asInstanceOf[js.Array[SimplifiedForm]]
  inline def simplifyForms(forms: js.Array[Form], options: SimplifyClaimsOptions): js.Array[SimplifiedForm] = (^.asInstanceOf[js.Dynamic].applyDynamic("simplifyForms")(forms.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[SimplifiedForm]]
}
