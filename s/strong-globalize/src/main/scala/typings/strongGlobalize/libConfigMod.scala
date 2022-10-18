package typings.strongGlobalize

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigMod {
  
  @JSImport("strong-globalize/lib/config", "STRONGLOOP_GLB")
  @js.native
  val STRONGLOOP_GLB: GlobalizeConfig = js.native
  
  type AnyObject[T] = StringDictionary[T]
  
  trait GlobalizeConfig extends StObject {
    
    var APP_LANGS: js.UndefOr[js.Array[String]] = js.undefined
    
    var AUTO_MSG_LOADING: js.UndefOr[String] = js.undefined
    
    var DEFAULT_LANG: js.UndefOr[String] = js.undefined
    
    var DISABLE_CONSOLE: js.UndefOr[Boolean] = js.undefined
    
    var LOG_FN: js.UndefOr[js.Function2[/* level */ String, /* message */ Any, Unit]] = js.undefined
    
    var MASTER_ROOT_DIR: js.UndefOr[String] = js.undefined
    
    var MSG_RES_LOADED: js.UndefOr[js.Array[ResourceTag]] = js.undefined
    
    var PSEUDO_LOC_PREAMBLE: js.UndefOr[String] = js.undefined
    
    var bundles: js.UndefOr[AnyObject[Any]] = js.undefined
    
    var formatters: js.UndefOr[Map[String, Any]] = js.undefined
    
    var getHash: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
    
    var initialized: js.UndefOr[Boolean] = js.undefined
    
    var load: js.UndefOr[js.Function1[/* obj */ AnyObject[Any], Unit]] = js.undefined
    
    var loadMessages: js.UndefOr[js.Function1[/* messages */ AnyObject[Any], Unit]] = js.undefined
    
    var locale: js.UndefOr[js.Function1[/* lang */ js.UndefOr[String], Unit]] = js.undefined
    
    def reset(): Unit
    
    var versionG: js.UndefOr[String] = js.undefined
    
    var versionSG: js.UndefOr[String] = js.undefined
  }
  object GlobalizeConfig {
    
    inline def apply(reset: () => Unit): GlobalizeConfig = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[GlobalizeConfig]
    }
    
    extension [Self <: GlobalizeConfig](x: Self) {
      
      inline def setAPP_LANGS(value: js.Array[String]): Self = StObject.set(x, "APP_LANGS", value.asInstanceOf[js.Any])
      
      inline def setAPP_LANGSUndefined: Self = StObject.set(x, "APP_LANGS", js.undefined)
      
      inline def setAPP_LANGSVarargs(value: String*): Self = StObject.set(x, "APP_LANGS", js.Array(value*))
      
      inline def setAUTO_MSG_LOADING(value: String): Self = StObject.set(x, "AUTO_MSG_LOADING", value.asInstanceOf[js.Any])
      
      inline def setAUTO_MSG_LOADINGUndefined: Self = StObject.set(x, "AUTO_MSG_LOADING", js.undefined)
      
      inline def setBundles(value: AnyObject[Any]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
      
      inline def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
      
      inline def setDEFAULT_LANG(value: String): Self = StObject.set(x, "DEFAULT_LANG", value.asInstanceOf[js.Any])
      
      inline def setDEFAULT_LANGUndefined: Self = StObject.set(x, "DEFAULT_LANG", js.undefined)
      
      inline def setDISABLE_CONSOLE(value: Boolean): Self = StObject.set(x, "DISABLE_CONSOLE", value.asInstanceOf[js.Any])
      
      inline def setDISABLE_CONSOLEUndefined: Self = StObject.set(x, "DISABLE_CONSOLE", js.undefined)
      
      inline def setFormatters(value: Map[String, Any]): Self = StObject.set(x, "formatters", value.asInstanceOf[js.Any])
      
      inline def setFormattersUndefined: Self = StObject.set(x, "formatters", js.undefined)
      
      inline def setGetHash(value: /* path */ String => String): Self = StObject.set(x, "getHash", js.Any.fromFunction1(value))
      
      inline def setGetHashUndefined: Self = StObject.set(x, "getHash", js.undefined)
      
      inline def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
      
      inline def setInitializedUndefined: Self = StObject.set(x, "initialized", js.undefined)
      
      inline def setLOG_FN(value: (/* level */ String, /* message */ Any) => Unit): Self = StObject.set(x, "LOG_FN", js.Any.fromFunction2(value))
      
      inline def setLOG_FNUndefined: Self = StObject.set(x, "LOG_FN", js.undefined)
      
      inline def setLoad(value: /* obj */ AnyObject[Any] => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadMessages(value: /* messages */ AnyObject[Any] => Unit): Self = StObject.set(x, "loadMessages", js.Any.fromFunction1(value))
      
      inline def setLoadMessagesUndefined: Self = StObject.set(x, "loadMessages", js.undefined)
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setLocale(value: /* lang */ js.UndefOr[String] => Unit): Self = StObject.set(x, "locale", js.Any.fromFunction1(value))
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMASTER_ROOT_DIR(value: String): Self = StObject.set(x, "MASTER_ROOT_DIR", value.asInstanceOf[js.Any])
      
      inline def setMASTER_ROOT_DIRUndefined: Self = StObject.set(x, "MASTER_ROOT_DIR", js.undefined)
      
      inline def setMSG_RES_LOADED(value: js.Array[ResourceTag]): Self = StObject.set(x, "MSG_RES_LOADED", value.asInstanceOf[js.Any])
      
      inline def setMSG_RES_LOADEDUndefined: Self = StObject.set(x, "MSG_RES_LOADED", js.undefined)
      
      inline def setMSG_RES_LOADEDVarargs(value: ResourceTag*): Self = StObject.set(x, "MSG_RES_LOADED", js.Array(value*))
      
      inline def setPSEUDO_LOC_PREAMBLE(value: String): Self = StObject.set(x, "PSEUDO_LOC_PREAMBLE", value.asInstanceOf[js.Any])
      
      inline def setPSEUDO_LOC_PREAMBLEUndefined: Self = StObject.set(x, "PSEUDO_LOC_PREAMBLE", js.undefined)
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setVersionG(value: String): Self = StObject.set(x, "versionG", value.asInstanceOf[js.Any])
      
      inline def setVersionGUndefined: Self = StObject.set(x, "versionG", js.undefined)
      
      inline def setVersionSG(value: String): Self = StObject.set(x, "versionSG", value.asInstanceOf[js.Any])
      
      inline def setVersionSGUndefined: Self = StObject.set(x, "versionSG", js.undefined)
    }
  }
  
  trait ResourceTag extends StObject {
    
    var fileIdHash: String
    
    var fileName: String
    
    var lang: String
    
    var tagType: String
  }
  object ResourceTag {
    
    inline def apply(fileIdHash: String, fileName: String, lang: String, tagType: String): ResourceTag = {
      val __obj = js.Dynamic.literal(fileIdHash = fileIdHash.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], tagType = tagType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceTag]
    }
    
    extension [Self <: ResourceTag](x: Self) {
      
      inline def setFileIdHash(value: String): Self = StObject.set(x, "fileIdHash", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setTagType(value: String): Self = StObject.set(x, "tagType", value.asInstanceOf[js.Any])
    }
  }
}
