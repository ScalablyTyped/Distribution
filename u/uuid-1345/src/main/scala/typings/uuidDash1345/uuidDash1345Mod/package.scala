package typings.uuidDash1345

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uuidDash1345Mod {
  import typings.node.Buffer

  type ASCIICallback = js.Function2[/* error */ String, /* result */ String, Unit]
  type BinaryCallback = js.Function2[/* error */ String, /* result */ Buffer, Unit]
  type ObjectCallback = js.Function2[/* error */ String, /* result */ UUID, Unit]
  type UuidTypes = String | Buffer | UUID
}
