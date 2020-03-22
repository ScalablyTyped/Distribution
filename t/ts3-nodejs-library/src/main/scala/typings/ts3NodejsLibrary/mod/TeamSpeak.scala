package typings.ts3NodejsLibrary.mod

import typings.ts3NodejsLibrary.PartialConnectionParams
import typings.ts3NodejsLibrary.queryResponseMod.QueryResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib", "TeamSpeak")
@js.native
class TeamSpeak protected ()
  extends typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak {
  def this(config: PartialConnectionParams) = this()
}

/* static members */
@JSImport("ts3-nodejs-library/lib", "TeamSpeak")
@js.native
object TeamSpeak extends js.Object {
  /**
    * connects via a Promise wrapper
    * @param config config options to connect
    */
  def connect(config: PartialConnectionParams): js.Promise[typings.ts3NodejsLibrary.teamSpeakMod.TeamSpeak] = js.native
  /**
    * filters an array with given filter
    * @param array the array which should get filtered
    * @param filter filter object
    */
  def filter[T /* <: QueryResponse */](array: js.Array[T], filter: T): js.Array[T] = js.native
  /**
    * retrieves the first element of an array
    * @param input the response input
    */
  def singleResponse[T](input: T): T = js.native
  def singleResponse[T](input: js.Array[T]): T = js.native
  /**
    * Transforms an Input to an Array
    * @param input input data which should be converted to an array
    */
  def toArray[T](input: T): js.Array[T] = js.native
  def toArray[T](input: js.Array[T]): js.Array[T] = js.native
  /**
    * waits a set time of ms
    * @param time time in ms to wait
    */
  def wait(time: Double): js.Promise[_] = js.native
}

