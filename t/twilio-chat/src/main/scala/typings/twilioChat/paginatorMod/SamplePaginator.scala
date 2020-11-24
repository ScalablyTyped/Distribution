package typings.twilioChat.paginatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc Pagination helper class.
  * @alias Paginator
  * @property {Array} items Array of elements of type T on current page
  * @property {boolean} hasNextPage Indicates the existence of next page
  * @property {boolean} hasPrevPage Indicates the existence of previous page
  */
@JSImport("twilio-chat/lib/interfaces/paginator", "SamplePaginator")
@js.native
class SamplePaginator[T] () extends Paginator[T]
