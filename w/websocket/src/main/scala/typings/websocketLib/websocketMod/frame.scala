package typings
package websocketLib.websocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait frame extends js.Object {
  /**
    * The binary payload data.
    * Even text frames are sent with a Buffer providing the binary payload data.
    */
  var binaryPayload: nodeLib.Buffer
  var closeStatus: scala.Double
  var config: IConfig
  /** Whether or not this is last frame in a fragmentation sequence */
  var fin: scala.Boolean
  var frameHeader: nodeLib.Buffer
  var frameTooLarge: scala.Boolean
  var invalidCloseFrameLength: scala.Boolean
  /**
    * Identifies the length of the payload data on a received frame.
    * When sending a frame, will be automatically calculated from `binaryPayload` object.
    */
  var length: scala.Double
  /**
    * Whether or not this frame is (or should be) masked. For outgoing frames, when
    * connected as a client, this flag is automatically forced to true by `connection`.
    * Outgoing frames sent from the server-side of a connection are not masked.
    */
  var mask: scala.Double
  var maskBytes: nodeLib.Buffer
  var maxReceivedFrameSize: scala.Double
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
  var opcode: scala.Double
  var protocolError: scala.Boolean
  /**
    * Represents the RSV1 field in the framing. Setting this to true will result in
    * a Protocol Error on the receiving peer.
    */
  var rsv1: scala.Boolean
  /**
    * Represents the RSV1 field in the framing. Setting this to true will result in
    * a Protocol Error on the receiving peer.
    */
  var rsv2: scala.Boolean
  /**
    * Represents the RSV1 field in the framing. Setting this to true will result in
    * a Protocol Error on the receiving peer.
    */
  var rsv3: scala.Boolean
  def addData(bufferList: IBufferList): scala.Boolean
  def throwAwayPayload(bufferList: IBufferList): scala.Boolean
  def toBuffer(nullMask: scala.Boolean): nodeLib.Buffer
}

object frame {
  @scala.inline
  def apply(
    addData: js.Function1[IBufferList, scala.Boolean],
    binaryPayload: nodeLib.Buffer,
    closeStatus: scala.Double,
    config: IConfig,
    fin: scala.Boolean,
    frameHeader: nodeLib.Buffer,
    frameTooLarge: scala.Boolean,
    invalidCloseFrameLength: scala.Boolean,
    length: scala.Double,
    mask: scala.Double,
    maskBytes: nodeLib.Buffer,
    maxReceivedFrameSize: scala.Double,
    opcode: scala.Double,
    protocolError: scala.Boolean,
    rsv1: scala.Boolean,
    rsv2: scala.Boolean,
    rsv3: scala.Boolean,
    throwAwayPayload: js.Function1[IBufferList, scala.Boolean],
    toBuffer: js.Function1[scala.Boolean, nodeLib.Buffer]
  ): frame = {
    val __obj = js.Dynamic.literal(addData = addData, binaryPayload = binaryPayload, closeStatus = closeStatus, config = config, fin = fin, frameHeader = frameHeader, frameTooLarge = frameTooLarge, invalidCloseFrameLength = invalidCloseFrameLength, length = length, mask = mask, maskBytes = maskBytes, maxReceivedFrameSize = maxReceivedFrameSize, opcode = opcode, protocolError = protocolError, rsv1 = rsv1, rsv2 = rsv2, rsv3 = rsv3, throwAwayPayload = throwAwayPayload, toBuffer = toBuffer)
  
    __obj.asInstanceOf[frame]
  }
}

