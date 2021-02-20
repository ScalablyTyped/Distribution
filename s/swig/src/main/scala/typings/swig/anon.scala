package typings.swig

import typings.swig.mod.TemplateLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Typeofloaders extends StObject {
    
    def fs(): TemplateLoader = js.native
    def fs(basepath: js.UndefOr[scala.Nothing], encoding: String): TemplateLoader = js.native
    def fs(basepath: String): TemplateLoader = js.native
    def fs(basepath: String, encoding: String): TemplateLoader = js.native
    
    def memory(mapping: js.Any): TemplateLoader = js.native
    def memory(mapping: js.Any, basepath: String): TemplateLoader = js.native
  }
}
