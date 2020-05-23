package typings.tryghostContentApi.mod

import org.scalablytyped.runtime.Instantiable1
import typings.tryghostContentApi.anon.Browse
import typings.tryghostContentApi.anon.BrowseBrowseFunction
import typings.tryghostContentApi.anon.BrowseRead
import typings.tryghostContentApi.anon.Read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tryghost/content-api", JSImport.Default)
@js.native
class default protected () extends GhostAPI {
  def this(options: GhostContentAPIOptions) = this()
  /* CompleteClass */
  override var authors: Read = js.native
  /* CompleteClass */
  override var pages: Browse = js.native
  /* CompleteClass */
  override var posts: Browse = js.native
  /* CompleteClass */
  override var settings: BrowseBrowseFunction = js.native
  /* CompleteClass */
  override var tags: BrowseRead = js.native
}

@JSImport("@tryghost/content-api", JSImport.Default)
@js.native
object default extends Instantiable1[/* options */ GhostContentAPIOptions, GhostAPI] {
  def apply(options: GhostContentAPIOptions): GhostAPI = js.native
}

