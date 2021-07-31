package typings.wonka

import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaSourceFromArrayMod {
  
  @JSImport("wonka/src/sources/wonka_source_fromArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromArray[A](array: js.Array[A]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
}
