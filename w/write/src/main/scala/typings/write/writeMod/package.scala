package typings.write

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object writeMod {
  import typings.node.Buffer
  import typings.node.fsMod.MakeDirectoryOptions
  import typings.node.fsMod.WriteFileOptions
  import typings.std.Error
  import typings.std.Extract
  import typings.std.Omit
  import typings.std.Record
  import typings.std.Uint8Array
  import typings.write.writeStrings.encoding
  import typings.write.writeStrings.recursive

  type Callback[T /* <: Data */] = js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[Result[T]], js.Any]
  type CreateWriteStreamOptions = Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<write.Fn_Options>[1] */ js.Any, 
    Record[String, js.Any]
  ]
  type Data = String | Buffer | Uint8Array
  type Options = (Omit[WriteFileOptions, encoding]) with (Omit[MakeDirectoryOptions, recursive]) with CommonOptions
  type StreamOptions = (Omit[CreateWriteStreamOptions, encoding]) with (Omit[MakeDirectoryOptions, recursive]) with CommonOptions
}
