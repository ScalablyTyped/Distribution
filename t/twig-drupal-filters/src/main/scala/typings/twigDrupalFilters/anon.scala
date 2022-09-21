package typings.twigDrupalFilters

import typings.twig.mod.CompileOptions
import typings.twig.mod.ExtendTagOptions
import typings.twig.mod.Parameters
import typings.twig.mod.RenderOptions
import typings.twig.mod.Template
import typings.twig.mod.Twig_
import typings.twigDrupalFilters.twigDrupalFiltersBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeofTwig extends StObject {
    
    def __express(
      path: String,
      options: CompileOptions,
      fn: js.Function2[/* err */ js.Error, /* result */ Any, Unit]
    ): Unit = js.native
    
    def cache(value: Boolean): Unit = js.native
    
    def compile(markup: String, options: CompileOptions): js.Function1[/* context */ Any, Any] = js.native
    
    def extend(`extension`: js.Function1[/* twig */ Twig_, Unit]): Unit = js.native
    
    @JSName("extendFilter")
    def extendFilter_false(
      name: String,
      definition: js.Function2[/* left */ Any, /* params */ js.Array[Any] | `false`, String]
    ): Unit = js.native
    
    def extendFunction(name: String, definition: js.Function1[/* repeated */ Any, String]): Unit = js.native
    
    def extendTag(definition: ExtendTagOptions): Unit = js.native
    
    def extendTest(name: String, definition: js.Function1[/* value */ Any, Boolean]): Unit = js.native
    
    def renderFile(path: String, fn: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): Unit = js.native
    def renderFile(path: String, options: RenderOptions, fn: js.Function2[/* err */ js.Error, /* result */ Any, Unit]): Unit = js.native
    
    def twig(params: Parameters): Template = js.native
  }
}
