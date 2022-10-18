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
    * If `options` is `string` or `Buffer`, it’s treated as `{value: options}`.
    * If `options` is a `URL`, it’s treated as `{path: options}`.
    * If `options` is a `VFile`, shallow copies its data over to the new file.
    * All fields in `options` are set on the newly created `VFile`.
    *
    * Path related fields are set in the following order (least specific to
    * most specific): `history`, `path`, `basename`, `stem`, `extname`,
    * `dirname`.
    *
    * It’s not possible to set either `dirname` or `extname` without setting
    * either `history`, `path`, `basename`, or `stem` as well.
    *
    * @param {Compatible} [value]
    */
  open class VFile ()
    extends typings.vfile.libMod.VFile {
    def this(value: Compatible) = this()
  }
  
  type Data = (Record[String, Any]) & js.Object
  
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
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    any extends node.buffer.<global>.Buffer ? never : node.buffer.<global>.Buffer
    }}}
    */
  @js.native
  trait MaybeBuffer extends StObject
  
  type Value = String | MaybeBuffer
}
