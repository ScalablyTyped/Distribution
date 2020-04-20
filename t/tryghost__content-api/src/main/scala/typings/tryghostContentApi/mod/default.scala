package typings.tryghostContentApi.mod

import org.scalablytyped.runtime.Instantiable1
import typings.tryghostContentApi.AnonBrowse
import typings.tryghostContentApi.AnonBrowseBrowseFunction
import typings.tryghostContentApi.AnonBrowseRead
import typings.tryghostContentApi.AnonRead
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tryghost/content-api", JSImport.Default)
@js.native
class default protected () extends GhostAPI {
  def this(options: GhostContentAPIOptions) = this()
  /* CompleteClass */
  override var authors: AnonRead = js.native
  /* CompleteClass */
  override var pages: AnonBrowse = js.native
  /* CompleteClass */
  override var posts: AnonBrowse = js.native
  /* CompleteClass */
  override var settings: AnonBrowseBrowseFunction = js.native
  /* CompleteClass */
  override var tags: AnonBrowseRead = js.native
}

@JSImport("@tryghost/content-api", JSImport.Default)
@js.native
object default extends Instantiable1[/* options */ GhostContentAPIOptions, GhostAPI] {
  def apply(options: GhostContentAPIOptions): GhostAPI = js.native
}

