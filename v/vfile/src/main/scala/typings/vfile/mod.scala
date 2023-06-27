package typings.vfile

import typings.std.Record
import typings.vfile.libMod.Compatible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vfile", "VFile")
  @js.native
  /**
    * Create a new virtual file.
    *
    * `options` is treated as:
    *
    * *   `string` or `Uint8Array` — `{value: options}`
    * *   `URL` — `{path: options}`
    * *   `VFile` — shallow copies its data over to the new file
    * *   `object` — all fields are shallow copied over to the new file
    *
    * Path related fields are set in the following order (least specific to
    * most specific): `history`, `path`, `basename`, `stem`, `extname`,
    * `dirname`.
    *
    * You cannot set `dirname` or `extname` without setting either `history`,
    * `path`, `basename`, or `stem` too.
    *
    * @param {Compatible | null | undefined} [value]
    *   File value.
    * @returns
    *   New instance.
    */
  open class VFile ()
    extends typings.vfile.libMod.VFile {
    def this(value: Compatible) = this()
  }
  
  type Data = Record[String, Any]
  
  trait DataMap extends StObject
  
  type Value = js.typedarray.Uint8Array | String
}
