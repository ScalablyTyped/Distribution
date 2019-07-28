package typings.websocket.websocketMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait frame extends js.Object {
  /**
    * The binary payload data.
    * Even text frames are sent with a Buffer providing the binary payload data.
    */
  var binaryPayload: Buffer
  var closeStatus: Double
  var config: IConfig
  /** Whether or not this is last frame in a fragmentation sequence */
  var fin: Boolean
  var frameHeader: Buffer
  var frameTooLarge: Boolean
  var invalidCloseFrameLength: Boolean
  /**
    * Identifies the length of the payload data on a received frame.
    * When sending a frame, will be automatically calculated from `binaryPayload` object.
    */
  var length: Double
  /**
    * Whether or not this frame is (or should be) masked. For outgoing frames, when
    * connected as a client, this flag is automatically forced to true by `connection`.
    * Outgoing frames sent from the server-side of a connection are not masked.
    */
  var mask: Double
  var maskBytes: Buffer
  var maxReceivedFrameSize: Double
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
  var opcode: Double
  var protocolError: Boolean
  /**
    * Represents the RSV1 field in the framing. Setting this to true will result in
    * a Protocol Error on the receiving peer.
    */
  var rsv1: Boolean
  /**
    * Represents the RSV1 field in the framing. Setting this to true will result in
    * a Protocol Error on the receiving peer.
    */
  var rsv2: Boolean
  /**
    * Represents the RSV1 field in the framing. Setting this to true will result in
    * a Protocol Error on the receiving peer.
    */
  var rsv3: Boolean
  def addData(bufferList: IBufferList): Boolean
  def throwAwayPayload(bufferList: IBufferList): Boolean
  def toBuffer(nullMask: Boolean): Buffer
}

object frame {
  @scala.inline
  def apply(
    addData: IBufferList => Boolean,
    binaryPayload: Buffer,
    closeStatus: Double,
    config: IConfig,
    fin: Boolean,
    frameHeader: Buffer,
    frameTooLarge: Boolean,
    invalidCloseFrameLength: Boolean,
    length: Double,
    mask: Double,
    maskBytes: Buffer,
    maxReceivedFrameSize: Double,
    opcode: Double,
    protocolError: Boolean,
    rsv1: Boolean,
    rsv2: Boolean,
    rsv3: Boolean,
    throwAwayPayload: IBufferList => Boolean,
    toBuffer: Boolean => Buffer
  ): frame = {
    val __obj = js.Dynamic.literal(addData = js.Any.fromFunction1(addData), binaryPayload = binaryPayload, closeStatus = closeStatus, config = config, fin = fin, frameHeader = frameHeader, frameTooLarge = frameTooLarge, invalidCloseFrameLength = invalidCloseFrameLength, length = length, mask = mask, maskBytes = maskBytes, maxReceivedFrameSize = maxReceivedFrameSize, opcode = opcode, protocolError = protocolError, rsv1 = rsv1, rsv2 = rsv2, rsv3 = rsv3, throwAwayPayload = js.Any.fromFunction1(throwAwayPayload), toBuffer = js.Any.fromFunction1(toBuffer))
  
    __obj.asInstanceOf[frame]
  }
}

