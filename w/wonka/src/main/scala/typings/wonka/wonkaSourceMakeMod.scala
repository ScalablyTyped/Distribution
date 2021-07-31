package typings.wonka

import typings.wonka.wonkaTypesMod.Observer
import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaSourceMakeMod {
  
  @JSImport("wonka/src/sources/wonka_source_make", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def make[A](f: js.Function1[/* observer */ Observer[A], js.Function0[Unit]]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(f.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
}
