package typings.webdriverManager

import typings.webdriverManager.anon.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webdriver-manager/built/lib/binaries/config_source", JSImport.Namespace)
@js.native
object configSourceMod extends js.Object {
  
  @js.native
  abstract class ConfigSource () extends js.Object {
    
    def getUrl(version: String): js.Promise[Url] = js.native
    
    def getVersionList(): js.Promise[js.Array[String]] = js.native
    
    var osarch: String = js.native
    
    var ostype: String = js.native
    
    var out_dir: String = js.native
  }
  
  @js.native
  abstract class GithubApiConfigSource protected () extends JsonConfigSource {
    def this(name: String, url: String) = this()
    
    /* private */ def readResponse(): js.Any = js.native
    
    /* private */ def requestJson(): js.Any = js.native
  }
  
  @js.native
  abstract class JsonConfigSource protected () extends ConfigSource {
    def this(name: String, jsonUrl: String) = this()
    
    /* protected */ def getFileName(): String = js.native
    
    /* protected */ def getJson(): js.Promise[String] = js.native
    
    var jsonUrl: String = js.native
    
    var name: String = js.native
  }
  
  @js.native
  abstract class XmlConfigSource protected () extends ConfigSource {
    def this(name: String, xmlUrl: String) = this()
    
    /* private */ def convertXml2js(xml: js.Any): js.Any = js.native
    
    /* protected */ def getFileName(): String = js.native
    
    /* protected */ def getXml(): js.Promise[_] = js.native
    
    var name: String = js.native
    
    /* private */ def readResponse(): js.Any = js.native
    
    /* private */ def requestXml(): js.Any = js.native
    
    var xmlUrl: String = js.native
  }
}
