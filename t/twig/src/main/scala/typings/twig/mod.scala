package typings.twig

import typings.std.Error
import typings.twig.anon.Twigoptions
import typings.twig.twigBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("twig", "cache")
  @js.native
  def cache(value: Boolean): Unit = js.native
  
  @JSImport("twig", "compile")
  @js.native
  def compile(markup: String, options: CompileOptions): js.Function1[/* context */ js.Any, _] = js.native
  
  @JSImport("twig", "__express")
  @js.native
  def express(
    path: String,
    options: CompileOptions,
    fn: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): Unit = js.native
  
  @JSImport("twig", "extendFilter")
  @js.native
  def extendFilter(name: String, definition: js.Function2[/* left */ js.Any, /* repeated */ js.Any, String]): Unit = js.native
  
  @JSImport("twig", "extendFunction")
  @js.native
  def extendFunction(name: String, definition: js.Function1[/* repeated */ js.Any, String]): Unit = js.native
  
  @JSImport("twig", "extendTag")
  @js.native
  def extendTag(definition: js.Any): Unit = js.native
  
  @JSImport("twig", "extendTest")
  @js.native
  def extendTest(name: String, definition: js.Function1[/* value */ js.Any, Boolean]): Unit = js.native
  
  @JSImport("twig", "renderFile")
  @js.native
  def renderFile(path: String, fn: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): Unit = js.native
  @JSImport("twig", "renderFile")
  @js.native
  def renderFile(path: String, options: RenderOptions, fn: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): Unit = js.native
  
  @JSImport("twig", "twig")
  @js.native
  def twig(params: Parameters): Template = js.native
  
  @js.native
  trait CompileOptions extends StObject {
    
    var filename: String = js.native
    
    var settings: Twigoptions = js.native
  }
  object CompileOptions {
    
    @scala.inline
    def apply(filename: String, settings: Twigoptions): CompileOptions = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompileOptions]
    }
    
    @scala.inline
    implicit class CompileOptionsMutableBuilder[Self <: CompileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettings(value: Twigoptions): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Parameters extends StObject {
    
    var async: js.UndefOr[js.Any] = js.native
    
    var base: js.UndefOr[js.Any] = js.native
    
    var blocks: js.UndefOr[js.Any] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var href: js.UndefOr[js.Any] = js.native
    
    var id: js.UndefOr[js.Any] = js.native
    
    var load: js.UndefOr[js.Function1[/* template */ Template, Unit]] = js.native
    
    var macros: js.UndefOr[js.Any] = js.native
    
    var method: js.UndefOr[js.Any] = js.native
    
    var name: js.UndefOr[js.Any] = js.native
    
    var options: js.UndefOr[js.Any] = js.native
    
    var path: js.UndefOr[js.Any] = js.native
  }
  object Parameters {
    
    @scala.inline
    def apply(): Parameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Parameters]
    }
    
    @scala.inline
    implicit class ParametersMutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: js.Any): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setBase(value: js.Any): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setBlocks(value: js.Any): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHref(value: js.Any): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLoad(value: /* template */ Template => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setMacros(value: js.Any): Self = StObject.set(x, "macros", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacrosUndefined: Self = StObject.set(x, "macros", js.undefined)
      
      @scala.inline
      def setMethod(value: js.Any): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  @js.native
  trait RenderOptions extends StObject {
    
    var allowAsync: js.UndefOr[Boolean] = js.native
    
    var settings: js.UndefOr[Twigoptions] = js.native
  }
  object RenderOptions {
    
    @scala.inline
    def apply(): RenderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderOptions]
    }
    
    @scala.inline
    implicit class RenderOptionsMutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowAsync(value: Boolean): Self = StObject.set(x, "allowAsync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowAsyncUndefined: Self = StObject.set(x, "allowAsync", js.undefined)
      
      @scala.inline
      def setSettings(value: Twigoptions): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
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
    def render(context: js.UndefOr[scala.Nothing], params: js.UndefOr[scala.Nothing], allow_async: Boolean): String | js.Promise[String] = js.native
    def render(context: js.UndefOr[scala.Nothing], params: js.Any): String = js.native
    def render(context: js.UndefOr[scala.Nothing], params: js.Any, allow_async: Boolean): String | js.Promise[String] = js.native
    def render(context: js.Any): String = js.native
    def render(context: js.Any, params: js.UndefOr[scala.Nothing], allow_async: Boolean): String | js.Promise[String] = js.native
    def render(context: js.Any, params: js.Any): String = js.native
    def render(context: js.Any, params: js.Any, allow_async: Boolean): String | js.Promise[String] = js.native
    
    def renderAsync(): js.Promise[String] = js.native
    def renderAsync(context: js.UndefOr[scala.Nothing], params: js.Any): js.Promise[String] = js.native
    def renderAsync(context: js.Any): js.Promise[String] = js.native
    def renderAsync(context: js.Any, params: js.Any): js.Promise[String] = js.native
    
    @JSName("render")
    def render_Union(): String | js.Promise[String] = js.native
    @JSName("render")
    def render_Union(context: js.UndefOr[scala.Nothing], params: js.Any): String | js.Promise[String] = js.native
    @JSName("render")
    def render_Union(context: js.Any): String | js.Promise[String] = js.native
    @JSName("render")
    def render_Union(context: js.Any, params: js.Any): String | js.Promise[String] = js.native
    @JSName("render")
    def render_false(context: js.UndefOr[scala.Nothing], params: js.UndefOr[scala.Nothing], allow_async: `false`): String = js.native
    @JSName("render")
    def render_false(context: js.UndefOr[scala.Nothing], params: js.Any, allow_async: `false`): String = js.native
    @JSName("render")
    def render_false(context: js.Any, params: js.UndefOr[scala.Nothing], allow_async: `false`): String = js.native
    @JSName("render")
    def render_false(context: js.Any, params: js.Any, allow_async: `false`): String = js.native
    
    def reset(blocks: js.Any): Unit = js.native
  }
}
