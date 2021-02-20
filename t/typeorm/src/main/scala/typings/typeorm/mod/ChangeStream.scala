package typings.typeorm.mod

import typings.typeorm.mongodbTypingsMod.ChangeStreamOptions
import typings.typeorm.mongodbTypingsMod.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "ChangeStream")
@js.native
class ChangeStream protected ()
  extends typings.typeorm.mongodbTypingsMod.ChangeStream {
  def this(changeDomain: Collection[_], pipeline: js.Array[js.Object]) = this()
  def this(changeDomain: typings.typeorm.mongodbTypingsMod.Db, pipeline: js.Array[js.Object]) = this()
  def this(changeDomain: typings.typeorm.mongodbTypingsMod.MongoClient, pipeline: js.Array[js.Object]) = this()
  def this(changeDomain: Collection[_], pipeline: js.Array[js.Object], options: ChangeStreamOptions) = this()
  def this(
    changeDomain: typings.typeorm.mongodbTypingsMod.Db,
    pipeline: js.Array[js.Object],
    options: ChangeStreamOptions
  ) = this()
  def this(
    changeDomain: typings.typeorm.mongodbTypingsMod.MongoClient,
    pipeline: js.Array[js.Object],
    options: ChangeStreamOptions
  ) = this()
}
