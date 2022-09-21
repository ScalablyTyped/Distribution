package typings.typedoc.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "DefaultTheme")
@js.native
open class DefaultTheme protected ()
  extends typings.typedoc.outputMod.DefaultTheme {
  /**
    * Create a new DefaultTheme instance.
    *
    * @param renderer  The renderer this theme is attached to.
    * @param basePath  The base path of this theme.
    */
  def this(renderer: typings.typedoc.rendererMod.Renderer) = this()
}
/* static members */
object DefaultTheme {
  
  @JSImport("typedoc", "DefaultTheme")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc", "DefaultTheme.URL_PREFIX")
  @js.native
  def URL_PREFIX: js.RegExp = js.native
  inline def URL_PREFIX_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL_PREFIX")(x.asInstanceOf[js.Any])
  
  /**
    * Generate an anchor url for the given reflection and all of its children.
    *
    * @param reflection  The reflection an anchor url should be created for.
    * @param container   The nearest reflection having an own document.
    */
  inline def applyAnchorUrl(reflection: typings.typedoc.modelsMod.Reflection, container: typings.typedoc.modelsMod.Reflection): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAnchorUrl")(reflection.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Generate the css classes for the given reflection and apply them to the
    * {@link DeclarationReflection.cssClasses} property.
    *
    * @param reflection  The reflection whose cssClasses property should be generated.
    */
  inline def applyReflectionClasses(reflection: typings.typedoc.modelsMod.DeclarationReflection, filters: Record[String, Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyReflectionClasses")(reflection.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Return a url for the given reflection.
    *
    * @param reflection  The reflection the url should be generated for.
    * @param relative    The parent reflection the url generation should stop on.
    * @param separator   The separator used to generate the url.
    * @returns           The generated url.
    */
  inline def getUrl(reflection: typings.typedoc.modelsMod.Reflection): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getUrl(reflection: typings.typedoc.modelsMod.Reflection, relative: Unit, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any], relative.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getUrl(reflection: typings.typedoc.modelsMod.Reflection, relative: typings.typedoc.modelsMod.Reflection): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any], relative.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getUrl(
    reflection: typings.typedoc.modelsMod.Reflection,
    relative: typings.typedoc.modelsMod.Reflection,
    separator: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(reflection.asInstanceOf[js.Any], relative.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Transform a space separated string into a string suitable to be used as a
    * css class, e.g. "constructor method" > "constructor-method".
    */
  inline def toStyleClass(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toStyleClass")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
