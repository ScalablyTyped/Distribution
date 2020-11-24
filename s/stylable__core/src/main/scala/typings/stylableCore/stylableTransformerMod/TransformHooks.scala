package typings.stylableCore.stylableTransformerMod

import typings.stylableCore.anon.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformHooks extends js.Object {
  
  var postProcessor: js.UndefOr[typings.stylableCore.stylableTransformerMod.postProcessor[js.Object]] = js.native
  
  var replaceValueHook: js.UndefOr[typings.stylableCore.stylableTransformerMod.replaceValueHook] = js.native
}
object TransformHooks {
  
  @scala.inline
  def apply(): TransformHooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformHooks]
  }
  
  @scala.inline
  implicit class TransformHooksOps[Self <: TransformHooks] (val x: Self) extends AnyVal {
    
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
    def setPostProcessor(
      value: (/* stylableResults */ StylableResults, /* transformer */ StylableTransformer) => StylableResults with js.Object
    ): Self = this.set("postProcessor", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePostProcessor: Self = this.set("postProcessor", js.undefined)
    
    @scala.inline
    def setReplaceValueHook(
      value: (/* value */ String, /* name */ String | Args, /* isLocal */ Boolean, /* passedThrough */ js.Array[String]) => String
    ): Self = this.set("replaceValueHook", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteReplaceValueHook: Self = this.set("replaceValueHook", js.undefined)
  }
}
