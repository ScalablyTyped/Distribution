package typings.typeorm.browserMod

import typings.typeorm.typingsMod.ChangeStreamOptions
import typings.typeorm.typingsMod.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "ChangeStream")
@js.native
class ChangeStream protected ()
  extends typings.typeorm.typingsMod.ChangeStream {
  def this(changeDomain: Collection[js.Any], pipeline: js.Array[js.Object]) = this()
  def this(changeDomain: typings.typeorm.typingsMod.Db, pipeline: js.Array[js.Object]) = this()
  def this(changeDomain: typings.typeorm.typingsMod.MongoClient, pipeline: js.Array[js.Object]) = this()
  def this(changeDomain: Collection[js.Any], pipeline: js.Array[js.Object], options: ChangeStreamOptions) = this()
  def this(
    changeDomain: typings.typeorm.typingsMod.Db,
    pipeline: js.Array[js.Object],
    options: ChangeStreamOptions
  ) = this()
  def this(
    changeDomain: typings.typeorm.typingsMod.MongoClient,
    pipeline: js.Array[js.Object],
    options: ChangeStreamOptions
  ) = this()
}
