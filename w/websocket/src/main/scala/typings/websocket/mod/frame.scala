package typings.websocket.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("websocket", "frame")
@js.native
class frame () extends js.Object {
  /**
    * The binary payload data.
    * Even text frames are sent with a Buffer providing the binary payload data.
    */
  var binaryPayload: Buffer = js.native
  var closeStatus: Double = js.native
  var config: IConfig = js.native
  var dropReason: String = js.native
  /** Whether or not this is last frame in a fragmentation sequence */
  var fin: Boolean = js.native
  var frameHeader: Buffer = js.native
  var frameTooLarge: Boolean = js.native
  var invalidCloseFrameLength: Boolean = js.native
  /**
    * Identifies the length of the payload data on a received frame.
    * When sending a frame, will be automatically calculated from `binaryPayload` object.
    */
  var length: Double = js.native
  /**
    * Whether or not this frame is (or should be) masked. For outgoing frames, when
    * connected as a client, this flag is automatically forced to true by `connection`.
    * Outgoing frames sent from the server-side of a connection are not masked.
    */
  var mask: Double = js.native
  var maskBytes: Buffer = js.native
  var maxReceivedFrameSize: Double = js.native
  /**
    * Identifies which kind of frame this is.
    *
    * Hex  - Dec - Description
    * 0x00 -   0 - Continuation
    * 0x01 -   1 - Text Frame
    * 0x02 -   2 - Binary Frame
    * 0x08 -   8 - Close Frame
    * 0x09 -   9 - Ping Frame
    * 0x0A -  10 - Pong Frame
    */
  var opcode: Double = js.native
  var parseState: Double = js.native
  var protocolError: Boolean = js.native
  /**
    * Represents the RSV1 field in the framing. Setting this to true will result in
    * a Protocol Error on the receiving peer.
    */
  var rsv1: Boolean = js.native
  /**
    * Represents the RSV1 field in the framing. Setting this to true will result in
    * a Protocol Error on the receiving peer.
    */
  var rsv2: Boolean = js.native
  /**
    * Represents the RSV1 field in the framing. Setting this to true will result in
    * a Protocol Error on the receiving peer.
    */
  var rsv3: Boolean = js.native
  def addData(bufferList: IBufferList): Boolean = js.native
  def throwAwayPayload(bufferList: IBufferList): Boolean = js.native
  def toBuffer(nullMask: Boolean): Buffer = js.native
}

