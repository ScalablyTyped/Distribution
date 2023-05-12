package typings.vfile

import typings.node.bufferMod.global.Buffer
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
    * *   `string` or `Buffer` — `{value: options}`
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
  
  /**
    * This is the same as `Buffer` if node types are included, `never` otherwise.
    */
  // eslint-disable-next-line @typescript-eslint/ban-ts-comment, @typescript-eslint/prefer-ts-expect-error
  // @ts-ignore It’s important to preserve this ignore statement. This makes sure
  // it works both with and without node types.
  // eslint-disable-next-line n/prefer-global/buffer
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    any extends node.buffer.<global>.Buffer ? never : node.buffer.<global>.Buffer
    }}}
    */
  type MaybeBuffer = Buffer
  
  type Value = String | MaybeBuffer
}
