package typings.twig

import typings.std.Error
import typings.twig.anon.Twigoptions
import typings.twig.twigBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("twig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cache(value: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cache")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def compile(markup: String, options: CompileOptions): js.Function1[/* context */ js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(markup.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* context */ js.Any, js.Any]]
  
  inline def express(
    path: String,
    options: CompileOptions,
    fn: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__express")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extendFilter(name: String, definition: js.Function2[/* left */ js.Any, /* repeated */ js.Any, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendFilter")(name.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extendFunction(name: String, definition: js.Function1[/* repeated */ js.Any, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendFunction")(name.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def extendTag(definition: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("extendTag")(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def extendTest(name: String, definition: js.Function1[/* value */ js.Any, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendTest")(name.asInstanceOf[js.Any], definition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderFile(path: String, fn: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderFile(path: String, options: RenderOptions, fn: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def twig(params: Parameters): Template = ^.asInstanceOf[js.Dynamic].applyDynamic("twig")(params.asInstanceOf[js.Any]).asInstanceOf[Template]
  
  trait CompileOptions extends StObject {
    
    var filename: String
    
    var settings: Twigoptions
  }
  object CompileOptions {
    
    inline def apply(filename: String, settings: Twigoptions): CompileOptions = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompileOptions]
    }
    
    extension [Self <: CompileOptions](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: Twigoptions): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  trait Parameters extends StObject {
    
    var async: js.UndefOr[js.Any] = js.undefined
    
    var base: js.UndefOr[js.Any] = js.undefined
    
    var blocks: js.UndefOr[js.Any] = js.undefined
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var href: js.UndefOr[js.Any] = js.undefined
    
    var id: js.UndefOr[js.Any] = js.undefined
    
    var load: js.UndefOr[js.Function1[/* template */ Template, Unit]] = js.undefined
    
    var macros: js.UndefOr[js.Any] = js.undefined
    
    var method: js.UndefOr[js.Any] = js.undefined
    
    var name: js.UndefOr[js.Any] = js.undefined
    
    var options: js.UndefOr[js.Any] = js.undefined
    
    var path: js.UndefOr[js.Any] = js.undefined
  }
  object Parameters {
    
    inline def apply(): Parameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Parameters]
    }
    
    extension [Self <: Parameters](x: Self) {
      
      inline def setAsync(value: js.Any): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setBase(value: js.Any): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setBlocks(value: js.Any): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHref(value: js.Any): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLoad(value: /* template */ Template => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setMacros(value: js.Any): Self = StObject.set(x, "macros", value.asInstanceOf[js.Any])
      
      inline def setMacrosUndefined: Self = StObject.set(x, "macros", js.undefined)
      
      inline def setMethod(value: js.Any): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait RenderOptions extends StObject {
    
    var allowAsync: js.UndefOr[Boolean] = js.undefined
    
    var settings: js.UndefOr[Twigoptions] = js.undefined
  }
  object RenderOptions {
    
    inline def apply(): RenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions]
    }
    
    extension [Self <: RenderOptions](x: Self) {
      
      inline def setAllowAsync(value: Boolean): Self = StObject.set(x, "allowAsync", value.asInstanceOf[js.Any])
      
      inline def setAllowAsyncUndefined: Self = StObject.set(x, "allowAsync", js.undefined)
      
      inline def setSettings(value: Twigoptions): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
  
  @js.native
  trait Template extends StObject {
    
    def compile(options: js.Any): String = js.native
    
    def getLoaderMethod(): String = js.native
    
    def importBlocks(file: String): Unit = js.native
    def importBlocks(file: String, `override`: Boolean): Unit = js.native
    
    def importFile(file: String): Template = js.native
    
    def importMacros(file: String): Template = js.native
    
    def render(): String = js.native
    def render(context: js.Any): String = js.native
    def render(context: js.Any, params: js.Any): String = js.native
    def render(context: js.Any, params: js.Any, allow_async: Boolean): String | js.Promise[String] = js.native
    def render(context: js.Any, params: Unit, allow_async: Boolean): String | js.Promise[String] = js.native
    def render(context: Unit, params: js.Any): String = js.native
    def render(context: Unit, params: js.Any, allow_async: Boolean): String | js.Promise[String] = js.native
    def render(context: Unit, params: Unit, allow_async: Boolean): String | js.Promise[String] = js.native
    
    def renderAsync(): js.Promise[String] = js.native
    def renderAsync(context: js.Any): js.Promise[String] = js.native
    def renderAsync(context: js.Any, params: js.Any): js.Promise[String] = js.native
    def renderAsync(context: Unit, params: js.Any): js.Promise[String] = js.native
    
    @JSName("render")
    def render_Union(): String | js.Promise[String] = js.native
    @JSName("render")
    def render_Union(context: js.Any): String | js.Promise[String] = js.native
    @JSName("render")
    def render_Union(context: js.Any, params: js.Any): String | js.Promise[String] = js.native
    @JSName("render")
    def render_Union(context: Unit, params: js.Any): String | js.Promise[String] = js.native
    @JSName("render")
    def render_false(context: js.Any, params: js.Any, allow_async: `false`): String = js.native
    @JSName("render")
    def render_false(context: js.Any, params: Unit, allow_async: `false`): String = js.native
    @JSName("render")
    def render_false(context: Unit, params: js.Any, allow_async: `false`): String = js.native
    @JSName("render")
    def render_false(context: Unit, params: Unit, allow_async: `false`): String = js.native
    
    def reset(blocks: js.Any): Unit = js.native
  }
}
