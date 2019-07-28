package typings.through2DashConcurrent.through2DashConcurrentMod

import typings.node.Anon_Chunk
import typings.node.Error
import typings.node.streamMod.Duplex
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Through2ConcurrentOptions extends DuplexOptions {
  var maxConcurrency: js.UndefOr[Double] = js.undefined
}

object Through2ConcurrentOptions {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    defaultEncoding: String = null,
    destroy: js.ThisFunction2[
      /* this */ Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    destroy_DuplexOptions: js.ThisFunction2[
      /* this */ Duplex, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    emitClose: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    `final`: js.ThisFunction1[
      (/* this */ Duplex) | (/* this */ Writable), 
      /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    highWaterMark: Int | Double = null,
    maxConcurrency: Int | Double = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    read: js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit] = null,
    read_DuplexOptions: js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit] = null,
    readableObjectMode: js.UndefOr[Boolean] = js.undefined,
    writableObjectMode: js.UndefOr[Boolean] = js.undefined,
    write: js.ThisFunction3[
      (/* this */ Duplex) | (/* this */ Writable), 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    writev: js.ThisFunction2[
      (/* this */ Duplex) | (/* this */ Writable), 
      /* chunks */ js.Array[Anon_Chunk], 
      /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null
  ): Through2ConcurrentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy)
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (destroy_DuplexOptions != null) __obj.updateDynamic("destroy")(destroy_DuplexOptions)
    if (!js.isUndefined(emitClose)) __obj.updateDynamic("emitClose")(emitClose)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (`final` != null) __obj.updateDynamic("final")(`final`)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (maxConcurrency != null) __obj.updateDynamic("maxConcurrency")(maxConcurrency.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (read != null) __obj.updateDynamic("read")(read)
    if (read_DuplexOptions != null) __obj.updateDynamic("read")(read_DuplexOptions)
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode)
    if (!js.isUndefined(writableObjectMode)) __obj.updateDynamic("writableObjectMode")(writableObjectMode)
    if (write != null) __obj.updateDynamic("write")(write)
    if (writev != null) __obj.updateDynamic("writev")(writev)
    __obj.asInstanceOf[Through2ConcurrentOptions]
  }
}

