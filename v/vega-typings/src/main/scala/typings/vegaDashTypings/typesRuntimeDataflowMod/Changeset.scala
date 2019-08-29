package typings.vegaDashTypings.typesRuntimeDataflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Changeset extends js.Object {
  def insert(tuples: js.Any): this.type = js.native
  def modify(tuple: js.Any): this.type = js.native
  def modify(tuple: js.Any, field: String): this.type = js.native
  def modify(tuple: js.Any, field: String, value: js.Any): this.type = js.native
  def remove(tuples: js.Any): this.type = js.native
}

