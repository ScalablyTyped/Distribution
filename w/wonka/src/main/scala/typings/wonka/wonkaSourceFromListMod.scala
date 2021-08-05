package typings.wonka

import typings.wonka.wonkaTypesMod.List
import typings.wonka.wonkaTypesMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wonkaSourceFromListMod {
  
  @JSImport("wonka/src/sources/wonka_source_fromList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromList[A](list: List[A]): Source[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromList")(list.asInstanceOf[js.Any]).asInstanceOf[Source[A]]
}
