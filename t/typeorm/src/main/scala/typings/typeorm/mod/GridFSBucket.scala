package typings.typeorm.mod

import typings.typeorm.mongodbTypingsMod.GridFSBucketOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm", "GridFSBucket")
@js.native
class GridFSBucket protected ()
  extends typings.typeorm.mongodbTypingsMod.GridFSBucket {
  /**
    *
    * @param db A db handle.
    * @param options Optional settings.
    */
  def this(db: typings.typeorm.mongodbTypingsMod.Db) = this()
  def this(db: typings.typeorm.mongodbTypingsMod.Db, options: GridFSBucketOptions) = this()
}
