package typings.webpackSources

import typings.webpackSources.libMod.SourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCompatSourceMod {
  
  @JSImport("webpack-sources/lib/CompatSource", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends typings.webpackSources.libSourceMod.^ {
    def this(sourceLike: SourceLike) = this()
  }
  @JSImport("webpack-sources/lib/CompatSource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def from(sourceLike: SourceLike): typings.webpackSources.libSourceMod.^ | CompatSource = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(sourceLike.asInstanceOf[js.Any]).asInstanceOf[typings.webpackSources.libSourceMod.^ | CompatSource]
  
  type CompatSource = typings.webpackSources.libSourceMod.^
}
