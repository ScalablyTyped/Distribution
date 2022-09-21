package typings.yaDisk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resources {
  
  @JSImport("ya-disk", "resources")
  @js.native
  val ^ : js.Any = js.native
  
  inline def copy(token: String, from: String, to: String): js.Promise[ApiResponse[Link]] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(token.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ApiResponse[Link]]]
  inline def copy(token: String, from: String, to: String, overwrite: Boolean): js.Promise[ApiResponse[Link]] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(token.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], overwrite.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ApiResponse[Link]]]
  inline def copy(token: String, from: String, to: String, overwrite: Boolean, fields: String): js.Promise[ApiResponse[Link]] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(token.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], overwrite.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ApiResponse[Link]]]
  inline def copy(token: String, from: String, to: String, overwrite: Unit, fields: String): js.Promise[ApiResponse[Link]] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(token.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], overwrite.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ApiResponse[Link]]]
  
  inline def create(token: String, path: String): js.Promise[Link] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(token.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Link]]
  
  inline def move(token: String, from: String, to: String): js.Promise[ApiResponse[Link]] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(token.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ApiResponse[Link]]]
  inline def move(token: String, from: String, to: String, overwrite: Boolean): js.Promise[ApiResponse[Link]] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(token.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], overwrite.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ApiResponse[Link]]]
  inline def move(token: String, from: String, to: String, overwrite: Boolean, fields: String): js.Promise[ApiResponse[Link]] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(token.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], overwrite.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ApiResponse[Link]]]
  inline def move(token: String, from: String, to: String, overwrite: Unit, fields: String): js.Promise[ApiResponse[Link]] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(token.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], overwrite.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ApiResponse[Link]]]
  
  inline def remove(token: String, path: String): js.Promise[ApiResponse[Link]] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(token.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ApiResponse[Link]]]
  inline def remove(token: String, path: String, permanently: Boolean): js.Promise[ApiResponse[Link]] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(token.asInstanceOf[js.Any], path.asInstanceOf[js.Any], permanently.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ApiResponse[Link]]]
}
