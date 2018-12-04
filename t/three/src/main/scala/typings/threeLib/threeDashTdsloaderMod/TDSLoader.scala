package typings
package threeLib.threeDashTdsloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-tdsloader", "TDSLoader")
@js.native
class TDSLoader protected () extends js.Object {
  def this(three: js.Any) = this()
  /**
     * Print debug message to the console.
     *
     * Is controlled by a flag to show or hide debug messages.
     *
     * @param message Debug message to print to the console.
     */
  def debugMessage(message: java.lang.String): scala.Unit = js.native
  /**
     * Set position to the end of the current chunk of data.
     *
     * @param chunk Data chunk.
     */
  def endChunk(chunk: js.Object): scala.Unit = js.native
  /**
     * Load 3ds file from url.
     *
     * @param url URL for the file.
     * @param onLoad onLoad callback, receives group object3D as argument.
     * @param onProgress onProgress callback.
     * @param onError onError callback.
     */
  def load(url: java.lang.String, onLoad: js.Function1[/* object3D */ threeLib.threeMod.Object3D, scala.Unit]): scala.Unit = js.native
  /**
     * Load 3ds file from url.
     *
     * @param url URL for the file.
     * @param onLoad onLoad callback, receives group object3D as argument.
     * @param onProgress onProgress callback.
     * @param onError onError callback.
     */
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* object3D */ threeLib.threeMod.Object3D, scala.Unit],
    onProgress: js.Function1[/* progress */ stdLib.ProgressEvent, scala.Unit]
  ): scala.Unit = js.native
  /**
     * Load 3ds file from url.
     *
     * @param url URL for the file.
     * @param onLoad onLoad callback, receives group object3D as argument.
     * @param onProgress onProgress callback.
     * @param onError onError callback.
     */
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* object3D */ threeLib.threeMod.Object3D, scala.Unit],
    onProgress: js.Function1[/* progress */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.ErrorEvent, scala.Unit]
  ): scala.Unit = js.native
  /**
     * Move to the next data chunk.
     *
     * @param data Dataview.
     * @param chunk Data chunk.
     */
  def nextChunk(data: stdLib.DataView, chunk: js.Object): scala.Double = js.native
  /**
     * Parse arraybuffer data and load 3ds file.
     *
     * @param arraybuffer Arraybuffer data to be loaded.
     * @param path Path for external resources.
     * @return Group loaded from 3ds file.
     */
  def parse(arraybuffer: stdLib.ArrayBuffer, path: java.lang.String): threeLib.threeMod.Object3D = js.native
  /**
     * Read byte value.
     *
     * @param data Dataview to read data from.
     * @return Data read from the dataview.
     */
  def readByte(data: stdLib.DataView): scala.Double = js.native
  /**
     * Read next chunk of data.
     *
     * @param data Dataview.
     * @return Chunk of data read.
     */
  def readChunk(data: stdLib.DataView): js.Object = js.native
  /**
     * Read a color value.
     *
     * @param data Dataview.
     * @return Color value read..
     */
  def readColor(data: stdLib.DataView): threeLib.threeMod.Color = js.native
  /**
     * Read 64 bit unsigned integer value.
     *
     * @param data Dataview to read data from.
     * @return Data read from the dataview.
     */
  def readDWord(data: stdLib.DataView): scala.Double = js.native
  /**
     * Read face array data chunk.
     *
     * @param data Dataview in use.
     * @param mesh Mesh to be filled with the data read.
     */
  def readFaceArray(data: stdLib.DataView, mesh: threeLib.threeMod.Mesh): scala.Unit = js.native
  /**
     * Decode file content to read 3ds data.
     *
     * @param arraybuffer Arraybuffer data to be loaded.
     */
  def readFile(arraybuffer: stdLib.ArrayBuffer, path: java.lang.String): scala.Unit = js.native
  /**
     * Read 32 bit float value.
     *
     * @param data Dataview to read data from.
     * @return Data read from the dataview.
     */
  def readFloat(data: stdLib.DataView): scala.Double = js.native
  /**
     * Read 32 bit signed integer value.
     *
     * @param data Dataview to read data from.
     * @return Data read from the dataview.
     */
  def readInt(data: stdLib.DataView): scala.Double = js.native
  /**
     * Read texture map data chunk.
     *
     * @param data Dataview in use.
     * @return Texture read from this data chunk.
     */
  def readMap(data: stdLib.DataView, path: java.lang.String): threeLib.threeMod.Texture = js.native
  /**
     * Read material data chunk and add it to the material list.
     *
     * @param data Dataview in use.
     */
  def readMaterialEntry(data: stdLib.DataView, path: java.lang.String): scala.Unit = js.native
  /**
     * Read material group data chunk.
     *
     * @param data Dataview in use.
     * @return object with name and index of the object.
     */
  def readMaterialGroup(data: stdLib.DataView): js.Object = js.native
  /**
     * Read mesh data chunk.
     *
     * @param data Dataview in use.
     */
  def readMesh(data: stdLib.DataView): scala.Unit = js.native
  /**
     * Read mesh data chunk.
     *
     * @param data Dataview in use.
     */
  def readMeshData(data: stdLib.DataView, path: java.lang.String): scala.Unit = js.native
  /**
     * Read named object chunk.
     *
     * @param data Dataview in use.
     */
  def readNamedobject(data: stdLib.DataView): scala.Unit = js.native
  /**
     * Read 16 bit signed integer value.
     *
     * @param data Dataview to read data from.
     * @return Data read from the dataview.
     */
  def readShort(data: stdLib.DataView): scala.Double = js.native
  /**
     * Read string value.
     *
     * @param data Dataview to read data from.
     * @param maxLength Max size of the string to be read.
     * @return Data read from the dataview.
     */
  def readString(data: stdLib.DataView, maxLength: scala.Double): java.lang.String = js.native
  /**
     * Read 32 bit unsigned integer value.
     *
     * @param data Dataview to read data from.
     * @return Data read from the dataview.
     */
  def readWord(data: stdLib.DataView): scala.Double = js.native
  /**
     * Reset dataview position.
     */
  def resetPosition(): scala.Unit = js.native
  /**
     * Set resource path used to determine the file path to attached resources.
     *
     * @param path Path to resources.
     * @return Self for chaining.
     */
  def setPath(path: java.lang.String): TDSLoader = js.native
}

