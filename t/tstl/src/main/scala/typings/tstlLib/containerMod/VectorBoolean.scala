package typings
package tstlLib.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container", "VectorBoolean")
@js.native
/**
  * Default Constructor.
  */
class VectorBoolean ()
  extends tstlLib.containerVectorBooleanMod.VectorBoolean {
  /**
    * Initializer Constructor.
    *
    * @param items Items to assign.
    */
  def this(array: js.Array[scala.Boolean]) = this()
  /**
    * Copy Constructor
    *
    * @param obj Object to copy.
    */
  def this(obj: tstlLib.containerVectorBooleanMod.VectorBoolean) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iteartor of the last position.
    */
  def this(first: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
        scala.Boolean, 
        tstlLib.iteratorIForwardIteratorMod.IForwardIterator[scala.Boolean, _]
      ]
    ], last: stdLib.Readonly[
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
        scala.Boolean, 
        tstlLib.iteratorIForwardIteratorMod.IForwardIterator[scala.Boolean, _]
      ]
    ]) = this()
  /**
    * Fill Constructor.
    *
    * @param size Initial size.
    * @param val Value to fill.
    */
  def this(n: scala.Double, `val`: scala.Boolean) = this()
}

