package typings.typeorm.browserMod

import typings.typeorm.typingsMod.GridFSBucketOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser", "GridFSBucket")
@js.native
class GridFSBucket protected ()
  extends typings.typeorm.typingsMod.GridFSBucket {
  /**
    *
    * @param db A db handle.
    * @param options Optional settings.
    */
  def this(db: typings.typeorm.typingsMod.Db) = this()
  def this(db: typings.typeorm.typingsMod.Db, options: GridFSBucketOptions) = this()
}
