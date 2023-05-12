package typings.tampermonkey.Tampermonkey

import typings.std.Record
import typings.tampermonkey.anon.Imported
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `.. | null` means if it was not explicitely set in the metadata
  * block it is null
  */
trait ScriptMetadata extends StObject {
  
  var antifeatures: Record[String, Record[String, String]]
  
  var author: String | Null
  
  var blockers: js.Array[String]
  
  var copyright: String | Null
  
  var deleted: js.UndefOr[Double] = js.undefined
  
  var description: String | Null
  
  var description_i18n: (Record[String, String]) | Null
  
  var downloadURL: String | Null
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var evilness: Double
  
  var excludes: js.Array[String]
  
  var fileURL: js.UndefOr[String | Null] = js.undefined
  
  var grant: js.Array[String]
  
  var header: String
  
  var homepage: String | Null
  
  var icon: String | Null
  
  var icon64: String | Null
  
  var includes: js.Array[String]
  
  var lastModified: Double
  
  var matches: js.Array[String]
  
  var name: String
  
  var name_i18n: (Record[String, String]) | Null
  
  var namespace: String | Null
  
  var options: ScriptSettings
  
  var position: Double
  
  var resources: js.Array[ScriptResource]
  
  /**
    * Never null, defaults to document-idle
    */
  var `run-at`: String
  
  var supportURL: String | Null
  
  var sync: js.UndefOr[Imported] = js.undefined
  
  var system: js.UndefOr[Boolean] = js.undefined
  
  var unwrap: Boolean
  
  var updateURL: String | Null
  
  var uuid: String
  
  var version: String
  
  var webRequest: js.Array[WebRequestRule] | Null
}
object ScriptMetadata {
  
  inline def apply(
    antifeatures: Record[String, Record[String, String]],
    blockers: js.Array[String],
    evilness: Double,
    excludes: js.Array[String],
    grant: js.Array[String],
    header: String,
    includes: js.Array[String],
    lastModified: Double,
    matches: js.Array[String],
    name: String,
    options: ScriptSettings,
    position: Double,
    resources: js.Array[ScriptResource],
    `run-at`: String,
    unwrap: Boolean,
    uuid: String,
    version: String
  ): ScriptMetadata = {
    val __obj = js.Dynamic.literal(antifeatures = antifeatures.asInstanceOf[js.Any], blockers = blockers.asInstanceOf[js.Any], evilness = evilness.asInstanceOf[js.Any], excludes = excludes.asInstanceOf[js.Any], grant = grant.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], unwrap = unwrap.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], author = null, copyright = null, description = null, description_i18n = null, downloadURL = null, homepage = null, icon = null, icon64 = null, name_i18n = null, namespace = null, supportURL = null, updateURL = null, webRequest = null)
    __obj.updateDynamic("run-at")(`run-at`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptMetadata] (val x: Self) extends AnyVal {
    
    inline def setAntifeatures(value: Record[String, Record[String, String]]): Self = StObject.set(x, "antifeatures", value.asInstanceOf[js.Any])
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setBlockers(value: js.Array[String]): Self = StObject.set(x, "blockers", value.asInstanceOf[js.Any])
    
    inline def setBlockersVarargs(value: String*): Self = StObject.set(x, "blockers", js.Array(value*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightNull: Self = StObject.set(x, "copyright", null)
    
    inline def setDeleted(value: Double): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescription_i18n(value: Record[String, String]): Self = StObject.set(x, "description_i18n", value.asInstanceOf[js.Any])
    
    inline def setDescription_i18nNull: Self = StObject.set(x, "description_i18n", null)
    
    inline def setDownloadURL(value: String): Self = StObject.set(x, "downloadURL", value.asInstanceOf[js.Any])
    
    inline def setDownloadURLNull: Self = StObject.set(x, "downloadURL", null)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEvilness(value: Double): Self = StObject.set(x, "evilness", value.asInstanceOf[js.Any])
    
    inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value*))
    
    inline def setFileURL(value: String): Self = StObject.set(x, "fileURL", value.asInstanceOf[js.Any])
    
    inline def setFileURLNull: Self = StObject.set(x, "fileURL", null)
    
    inline def setFileURLUndefined: Self = StObject.set(x, "fileURL", js.undefined)
    
    inline def setGrant(value: js.Array[String]): Self = StObject.set(x, "grant", value.asInstanceOf[js.Any])
    
    inline def setGrantVarargs(value: String*): Self = StObject.set(x, "grant", js.Array(value*))
    
    inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
    
    inline def setHomepageNull: Self = StObject.set(x, "homepage", null)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIcon64(value: String): Self = StObject.set(x, "icon64", value.asInstanceOf[js.Any])
    
    inline def setIcon64Null: Self = StObject.set(x, "icon64", null)
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIncludes(value: js.Array[String]): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
    
    inline def setIncludesVarargs(value: String*): Self = StObject.set(x, "includes", js.Array(value*))
    
    inline def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setName_i18n(value: Record[String, String]): Self = StObject.set(x, "name_i18n", value.asInstanceOf[js.Any])
    
    inline def setName_i18nNull: Self = StObject.set(x, "name_i18n", null)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
    
    inline def setOptions(value: ScriptSettings): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setResources(value: js.Array[ScriptResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: ScriptResource*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def `setRun-at`(value: String): Self = StObject.set(x, "run-at", value.asInstanceOf[js.Any])
    
    inline def setSupportURL(value: String): Self = StObject.set(x, "supportURL", value.asInstanceOf[js.Any])
    
    inline def setSupportURLNull: Self = StObject.set(x, "supportURL", null)
    
    inline def setSync(value: Imported): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    inline def setSystem(value: Boolean): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setUnwrap(value: Boolean): Self = StObject.set(x, "unwrap", value.asInstanceOf[js.Any])
    
    inline def setUpdateURL(value: String): Self = StObject.set(x, "updateURL", value.asInstanceOf[js.Any])
    
    inline def setUpdateURLNull: Self = StObject.set(x, "updateURL", null)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setWebRequest(value: js.Array[WebRequestRule]): Self = StObject.set(x, "webRequest", value.asInstanceOf[js.Any])
    
    inline def setWebRequestNull: Self = StObject.set(x, "webRequest", null)
    
    inline def setWebRequestVarargs(value: WebRequestRule*): Self = StObject.set(x, "webRequest", js.Array(value*))
  }
}
