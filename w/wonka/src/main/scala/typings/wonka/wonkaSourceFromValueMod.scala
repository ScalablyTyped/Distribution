package typings.wonka

import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaSourceFromValueMod {
  
  @JSImport("wonka/src/sources/wonka_source_fromValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromValue[A](value: A): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
}
