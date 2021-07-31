package typings.webpackSources

import typings.webpackSources.libMod.SourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compatSourceMod {
  
  @JSImport("webpack-sources/lib/CompatSource", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends typings.webpackSources.sourceMod.^ {
    def this(sourceLike: SourceLike) = this()
  }
  @JSImport("webpack-sources/lib/CompatSource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def from(sourceLike: SourceLike): typings.webpackSources.sourceMod.^ | CompatSource = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(sourceLike.asInstanceOf[js.Any]).asInstanceOf[typings.webpackSources.sourceMod.^ | CompatSource]
  
  type CompatSource = typings.webpackSources.sourceMod.^
}
