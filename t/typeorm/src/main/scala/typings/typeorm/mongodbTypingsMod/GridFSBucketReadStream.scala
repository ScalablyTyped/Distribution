package typings.typeorm.mongodbTypingsMod

import typings.typeorm.platformPlatformToolsMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/driver/mongodb/typings", "GridFSBucketReadStream")
@js.native
class GridFSBucketReadStream protected () extends Readable {
  /**
    *
    * @param chunks Handle for chunks collection.
    * @param files Handle for files collection.
    * @param readPreference The read preference to use.
    * @param filter The query to use to find the file document.
    * @param options Optional settings.
    */
  def this(
    chunks: Collection[js.Any],
    files: Collection[js.Any],
    readPreference: js.Object,
    filter: js.Object
  ) = this()
  def this(
    chunks: Collection[js.Any],
    files: Collection[js.Any],
    readPreference: js.Object,
    filter: js.Object,
    options: GridFSBucketReadStreamOptions
  ) = this()
}
