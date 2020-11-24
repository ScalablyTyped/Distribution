package typings.trustedTypes.mod.global

import typings.trustedTypes.mod.Args
import typings.trustedTypes.trustedTypesStrings.createHTML
import typings.trustedTypes.trustedTypesStrings.createScript
import typings.trustedTypes.trustedTypesStrings.createScriptURL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrustedTypePolicy[Options /* <: TrustedTypePolicyOptions */] extends js.Object {
  
  @JSName("createHTML")
  def createHTML_createHTML(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args<Options, 'createHTML'> is not an array type */ args: Args[Options, createHTML]
  ): TrustedHTML = js.native
  
  @JSName("createScriptURL")
  def createScriptURL_createScriptURL(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args<Options, 'createScriptURL'> is not an array type */ args: Args[Options, createScriptURL]
  ): TrustedScriptURL = js.native
  
  @JSName("createScript")
  def createScript_createScript(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args<Options, 'createScript'> is not an array type */ args: Args[Options, createScript]
  ): TrustedScript = js.native
  
  val name: String = js.native
}
object TrustedTypePolicy {
  
  @scala.inline
  def apply[Options /* <: TrustedTypePolicyOptions */](
    createHTML: Args[Options, createHTML] => TrustedHTML,
    createScript: Args[Options, createScript] => TrustedScript,
    createScriptURL: Args[Options, createScriptURL] => TrustedScriptURL,
    name: String
  ): TrustedTypePolicy[Options] = {
    val __obj = js.Dynamic.literal(createHTML = js.Any.fromFunction1(createHTML), createScript = js.Any.fromFunction1(createScript), createScriptURL = js.Any.fromFunction1(createScriptURL), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedTypePolicy[Options]]
  }
  
  @scala.inline
  implicit class TrustedTypePolicyOps[Self <: TrustedTypePolicy[_], Options /* <: TrustedTypePolicyOptions */] (val x: Self with TrustedTypePolicy[Options]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateHTML(value: Args[Options, createHTML] => TrustedHTML): Self = this.set("createHTML", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateScript(value: Args[Options, createScript] => TrustedScript): Self = this.set("createScript", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateScriptURL(value: Args[Options, createScriptURL] => TrustedScriptURL): Self = this.set("createScriptURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
