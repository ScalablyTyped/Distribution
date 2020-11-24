package typings.uuid1345

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ASCIICallback = js.Function2[/* error */ java.lang.String, /* result */ java.lang.String, scala.Unit]
  
  type BinaryCallback = js.Function2[/* error */ java.lang.String, /* result */ typings.node.Buffer, scala.Unit]
  
  type ObjectCallback = js.Function2[/* error */ java.lang.String, /* result */ typings.uuid1345.mod.UUID, scala.Unit]
  
  type UuidTypes = java.lang.String | typings.node.Buffer | typings.uuid1345.mod.UUID
}
