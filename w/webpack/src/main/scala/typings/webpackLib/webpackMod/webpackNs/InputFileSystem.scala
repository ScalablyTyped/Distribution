package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputFileSystem extends js.Object {
  var purge: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  def readFile(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
      /* contents */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit
  def readFileSync(path: java.lang.String): nodeLib.Buffer
  def readlink(
    path: java.lang.String,
    callback: js.Function2[
      /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
      /* linkString */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit
  def readlinkSync(path: java.lang.String): java.lang.String
  def stat(
    path: java.lang.String,
    callback: js.Function2[/* err */ js.UndefOr[nodeLib.Error | scala.Null], /* stats */ js.Any, scala.Unit]
  ): scala.Unit
  def statSync(path: java.lang.String): js.Any
}

object InputFileSystem {
  @scala.inline
  def apply(
    readFile: js.Function2[
      java.lang.String, 
      js.Function2[
        /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
        /* contents */ nodeLib.Buffer, 
        scala.Unit
      ], 
      scala.Unit
    ],
    readFileSync: js.Function1[java.lang.String, nodeLib.Buffer],
    readlink: js.Function2[
      java.lang.String, 
      js.Function2[
        /* err */ js.UndefOr[nodeLib.Error | scala.Null], 
        /* linkString */ java.lang.String, 
        scala.Unit
      ], 
      scala.Unit
    ],
    readlinkSync: js.Function1[java.lang.String, java.lang.String],
    stat: js.Function2[
      java.lang.String, 
      js.Function2[/* err */ js.UndefOr[nodeLib.Error | scala.Null], /* stats */ js.Any, scala.Unit], 
      scala.Unit
    ],
    statSync: js.Function1[java.lang.String, js.Any],
    purge: js.Function0[scala.Unit] = null
  ): InputFileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("readFile")(readFile)
    __obj.updateDynamic("readFileSync")(readFileSync)
    __obj.updateDynamic("readlink")(readlink)
    __obj.updateDynamic("readlinkSync")(readlinkSync)
    __obj.updateDynamic("stat")(stat)
    __obj.updateDynamic("statSync")(statSync)
    if (purge != null) __obj.updateDynamic("purge")(purge)
    __obj.asInstanceOf[InputFileSystem]
  }
}

