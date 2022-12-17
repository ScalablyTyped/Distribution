package typings.webcryptoCore.mod

import typings.pvtsutils.mod.ArrayBufferViewConstructor
import typings.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webcrypto-core", "BufferSourceConverter")
@js.native
open class BufferSourceConverter ()
  extends typings.pvtsutils.mod.BufferSourceConverter
object BufferSourceConverter {
  
  @JSImport("webcrypto-core", "BufferSourceConverter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Concatenates buffers
    * @param buffers List of buffers
    * @returns Concatenated buffer
    */
  /* static member */
  inline def concat(buffers: BufferSource*): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.typedarray.ArrayBuffer]
  /**
    * Concatenates buffers
    * @param buffers List of buffers
    * @returns Concatenated buffer
    */
  /* static member */
  inline def concat(buffers: js.Array[BufferSource]): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  /**
    * Concatenates buffers and converts it into specified ArrayBufferView
    * @param buffers List of buffers
    * @param type ArrayBufferView constructor
    * @returns Concatenated buffer of specified type
    */
  /* static member */
  inline def concat[T /* <: js.typedarray.ArrayBufferView */](buffers: js.Array[BufferSource], `type`: ArrayBufferViewConstructor[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Checks if incoming data is ArrayBuffer
    * @param data Data to be checked
    * @returns Returns `true` if incoming data is ArrayBuffer, otherwise `false`
    */
  /* static member */
  inline def isArrayBuffer(data: Any): /* is std.ArrayBuffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayBuffer")(data.asInstanceOf[js.Any]).asInstanceOf[/* is std.ArrayBuffer */ Boolean]
  
  /**
    * Checks if incoming data is ArraybufferView
    * @param data Data to be checked
    * @returns Returns `true` if incoming data is ArraybufferView, otherwise `false`
    */
  /* static member */
  inline def isArrayBufferView(data: Any): /* is std.ArrayBufferView */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayBufferView")(data.asInstanceOf[js.Any]).asInstanceOf[/* is std.ArrayBufferView */ Boolean]
  
  /**
    * Checks if incoming data is BufferSource
    * @param data Data to be checked
    * @returns Returns `true` if incoming data is BufferSource, otherwise `false`
    */
  /* static member */
  inline def isBufferSource(data: Any): /* is pvtsutils.pvtsutils.BufferSource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBufferSource")(data.asInstanceOf[js.Any]).asInstanceOf[/* is pvtsutils.pvtsutils.BufferSource */ Boolean]
  
  /**
    * Checks if buffers are equal
    * @param a Buffer source
    * @param b Buffer source
    * @returns Returns `true` if buffers are equal, otherwise `false`
    */
  /* static member */
  inline def isEqual(a: BufferSource, b: BufferSource): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Converts incoming buffer source into ArrayBuffer
    * @param data Buffer source
    * @returns ArrayBuffer representation of data
    */
  /* static member */
  inline def toArrayBuffer(data: BufferSource): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toArrayBuffer")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  /**
    * Converts incoming buffer source into Uint8Array
    * @param data Buffer source
    * @returns Uint8Array representation of data
    */
  /* static member */
  inline def toUint8Array(data: BufferSource): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toUint8Array")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  /**
    * Converts BufferSource to ArrayBufferView specified view
    * @param data Buffer source
    * @param type Type of ArrayBufferView
    * @returns Specified ArrayBufferView
    */
  /* static member */
  inline def toView[T /* <: js.typedarray.ArrayBufferView */](data: BufferSource, `type`: ArrayBufferViewConstructor[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("toView")(data.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[T]
}
