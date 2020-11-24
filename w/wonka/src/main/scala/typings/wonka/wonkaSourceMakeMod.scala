package typings.wonka

import typings.wonka.wonkaTypesMod.Observer
import typings.wonka.wonkaTypesMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonka/src/sources/wonka_source_make", JSImport.Namespace)
@js.native
object wonkaSourceMakeMod extends js.Object {
  
  def make[A](f: js.Function1[/* observer */ Observer[A], js.Function0[Unit]]): Source[A] = js.native
}
