package typings.urlAssembler

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.qs.mod.IStringifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("url-assembler", JSImport.Namespace)
  @js.native
  val ^ : js.Object & UrlAssemblerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("url-assembler", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with UrlAssembler {
    def this(baseUrl: String) = this()
    def this(urlAssembler: UrlAssembler) = this()
  }
  
  @js.native
  trait UrlAssembler extends StObject {
    
    def param(key: String, value: String): UrlAssembler = js.native
    def param(key: String, value: String, strict: Boolean): UrlAssembler = js.native
    def param(params: StringDictionary[Any]): UrlAssembler = js.native
    def param(params: StringDictionary[Any], strict: Boolean): UrlAssembler = js.native
    
    var pathname: String = js.native
    
    def prefix(subPath: String): UrlAssembler = js.native
    
    def qsConfig(config: IStringifyOptions): UrlAssembler = js.native
    
    def query(key: String, value: Any): UrlAssembler = js.native
    def query(params: StringDictionary[Any]): UrlAssembler = js.native
    
    def segment(subPathTemplate: String): UrlAssembler = js.native
    
    def template(template: String): UrlAssembler = js.native
    
    def toJSON(): String = js.native
  }
  
  @js.native
  trait UrlAssemblerConstructor
    extends StObject
       with Instantiable0[UrlAssembler]
       with Instantiable1[(/* baseUrl */ String) | (/* urlAssembler */ UrlAssembler), UrlAssembler] {
    
    def apply(): UrlAssembler = js.native
    def apply(baseUrl: String): UrlAssembler = js.native
    def apply(urlAssembler: UrlAssembler): UrlAssembler = js.native
  }
  
  type _To = js.Object & UrlAssemblerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & UrlAssemblerConstructor = ^
}
