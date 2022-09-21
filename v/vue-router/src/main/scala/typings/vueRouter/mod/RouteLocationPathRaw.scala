package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteLocationPathRaw
  extends StObject
     with RouteQueryAndHash
     with MatcherLocationAsPath
     with RouteLocationOptions
     with _RouteLocationRaw
object RouteLocationPathRaw {
  
  inline def apply(path: String): RouteLocationPathRaw = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLocationPathRaw]
  }
}
