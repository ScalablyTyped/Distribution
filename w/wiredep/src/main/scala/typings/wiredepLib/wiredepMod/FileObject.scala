package typings
package wiredepLib.wiredepMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FileObject extends js.Object {
  /**
       * type of wiredep block ('js', 'css', etc)
       */
  var block: java.lang.String
  /**
       * name of file that was updated
       */
  var file: java.lang.String
  /**
       * path to file that was injected
       */
  var path: java.lang.String
}

