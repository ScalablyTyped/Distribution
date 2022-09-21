package typings.webpInCss

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Declaration
import typings.postcss.mod.PluginCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line  no-declare-current-package keeping it simple
object mod extends Shortcut {
  
  @JSImport("webp-in-css/plugin", JSImport.Namespace)
  @js.native
  val ^ : Plugin = js.native
  
  trait Options extends StObject {
    
    /** @default true */
    var addNoJs: js.UndefOr[Boolean] = js.undefined
    
    /** @default decl => /\.(jpe?g|png)(?!(\.webp|.*[&?]format=webp))/i.test(decl.value) */
    var check: js.UndefOr[js.Function1[/* decl */ Declaration, Boolean]] = js.undefined
    
    /** @default false */
    var modules: js.UndefOr[Boolean] = js.undefined
    
    /** @default 'no-js' */
    var noJsClass: js.UndefOr[String] = js.undefined
    
    /** @default 'no-webp' */
    var noWebpClass: js.UndefOr[String] = js.undefined
    
    /** @default oldName => oldName.replace(/\.(jpe?g|png)/gi, '.webp') */
    var rename: js.UndefOr[js.Function1[/* url */ String, String]] = js.undefined
    
    /** @default 'webp' */
    var webpClass: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAddNoJs(value: Boolean): Self = StObject.set(x, "addNoJs", value.asInstanceOf[js.Any])
      
      inline def setAddNoJsUndefined: Self = StObject.set(x, "addNoJs", js.undefined)
      
      inline def setCheck(value: /* decl */ Declaration => Boolean): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
      
      inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      inline def setModules(value: Boolean): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setNoJsClass(value: String): Self = StObject.set(x, "noJsClass", value.asInstanceOf[js.Any])
      
      inline def setNoJsClassUndefined: Self = StObject.set(x, "noJsClass", js.undefined)
      
      inline def setNoWebpClass(value: String): Self = StObject.set(x, "noWebpClass", value.asInstanceOf[js.Any])
      
      inline def setNoWebpClassUndefined: Self = StObject.set(x, "noWebpClass", js.undefined)
      
      inline def setRename(value: /* url */ String => String): Self = StObject.set(x, "rename", js.Any.fromFunction1(value))
      
      inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
      
      inline def setWebpClass(value: String): Self = StObject.set(x, "webpClass", value.asInstanceOf[js.Any])
      
      inline def setWebpClassUndefined: Self = StObject.set(x, "webpClass", js.undefined)
    }
  }
  
  type Plugin = PluginCreator[Options]
  
  type _To = Plugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Plugin = ^
}
