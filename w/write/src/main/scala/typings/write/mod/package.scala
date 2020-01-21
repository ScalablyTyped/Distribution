package typings.write

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T /* <: typings.write.mod.Data */] = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* result */ js.UndefOr[typings.write.mod.Result[T]], 
    js.Any
  ]
  type CreateWriteStreamOptions = typings.std.Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<write.Fn_Options>[1] */ js.Any, 
    typings.std.Record[java.lang.String, js.Any]
  ]
  type Data = java.lang.String | typings.node.Buffer | typings.std.Uint8Array
  type Options = (typings.std.Omit[typings.node.fsMod.WriteFileOptions, typings.write.writeStrings.encoding]) with (typings.std.Omit[typings.node.fsMod.MakeDirectoryOptions, typings.write.writeStrings.recursive]) with typings.write.mod.CommonOptions
  type StreamOptions = (typings.std.Omit[typings.write.mod.CreateWriteStreamOptions, typings.write.writeStrings.encoding]) with (typings.std.Omit[typings.node.fsMod.MakeDirectoryOptions, typings.write.writeStrings.recursive]) with typings.write.mod.CommonOptions
}
