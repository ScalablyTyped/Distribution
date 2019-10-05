package typings.wegameDashApi.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object types {
  import typings.wegameDashApi.Anon_Data
  import typings.wegameDashApi.Anon_ErrMsg
  import typings.wegameDashApi.Anon_Header

  type SocketErrorCallback = js.Function1[/* res */ Anon_ErrMsg, Unit]
  type SocketMessageCallback = js.Function1[/* res */ Anon_Data, Unit]
  type SocketOpenCallback = js.Function1[/* res */ Anon_Header, Unit]
}
