package typings.wikibaseSdk

import typings.wikibaseSdk.distSrcTypesOptionsMod.Url
import typings.wikibaseSdk.distSrcTypesOptionsMod.WmLanguageCode
import typings.wikibaseSdk.distSrcTypesSitelinksMod.Site
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcHelpersSitelinksMod {
  
  @JSImport("wikibase-sdk/dist/src/helpers/sitelinks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSitelinkData(site: Url): SitelinkData = ^.asInstanceOf[js.Dynamic].applyDynamic("getSitelinkData")(site.asInstanceOf[js.Any]).asInstanceOf[SitelinkData]
  inline def getSitelinkData(site: Site): SitelinkData = ^.asInstanceOf[js.Dynamic].applyDynamic("getSitelinkData")(site.asInstanceOf[js.Any]).asInstanceOf[SitelinkData]
  
  inline def getSitelinkUrl(param0: GetSitelinkUrlOptions): Url = ^.asInstanceOf[js.Dynamic].applyDynamic("getSitelinkUrl")(param0.asInstanceOf[js.Any]).asInstanceOf[Url]
  
  inline def isSitelinkKey(site: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSitelinkKey")(site.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("wikibase-sdk/dist/src/helpers/sitelinks", "wikimediaLanguageCodes")
  @js.native
  val wikimediaLanguageCodes: js.Array[Any] = js.native
  
  trait GetSitelinkUrlOptions extends StObject {
    
    var site: Site
    
    var title: String
  }
  object GetSitelinkUrlOptions {
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetSitelinkUrlOptions] (val x: Self) extends AnyVal {
      
      inline def setSite(value: Site): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type Project = /* import warning: importer.ImportType#apply Failed type conversion: std.Array<'specieswiki' | 'commons' | 'mediawiki' | 'meta' | 'wikidata' | 'wikimania' | 'wikipedia' | 'wikisource' | 'wikiquote' | 'wiktionary' | 'wikibooks' | 'wikiversity' | 'wikivoyage' | 'wikinews'>[number] */ js.Any
  
  trait SitelinkData extends StObject {
    
    var key: String
    
    var lang: WmLanguageCode
    
    var project: Project
    
    var title: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[Url] = js.undefined
  }
  object SitelinkData {
    
    inline def apply(key: String, lang: WmLanguageCode, project: Project): SitelinkData = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
      __obj.asInstanceOf[SitelinkData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SitelinkData] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLang(value: WmLanguageCode): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setProject(value: Project): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
