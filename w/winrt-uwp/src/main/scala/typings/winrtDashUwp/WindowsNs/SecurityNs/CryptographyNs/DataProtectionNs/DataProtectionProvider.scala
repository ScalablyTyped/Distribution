package typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.DataProtectionNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncAction
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IInputStream
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a cryptographic provider that can be used to asynchronously encrypt and decrypt static data or a data stream. */
@JSGlobal("Windows.Security.Cryptography.DataProtection.DataProtectionProvider")
@js.native
/** Constructor used for decryption operations. Use this constructor before calling the UnprotectAsync or UnprotectStreamAsync methods. */
class DataProtectionProvider () extends js.Object {
  /**
    * Constructor used for encryption operations. Use this constructor before calling the ProtectAsync or ProtectStreamAsync methods.
    * @param protectionDescriptor Contains the protection descriptor that determines the entity to which the data will be encrypted. For more information, see Remarks.
    */
  def this(protectionDescriptor: String) = this()
  /**
    * Asynchronously protects static data.
    * @param data Data to protect.
    * @return Represents an asynchronous operation.
    */
  def protectAsync(data: IBuffer): IPromiseWithIAsyncOperation[IBuffer] = js.native
  /**
    * Asynchronously protects a data stream.
    * @param src Stream to be protected.
    * @param dest Protected stream.
    * @return Represents an asynchronous action.
    */
  def protectStreamAsync(src: IInputStream, dest: IOutputStream): IPromiseWithIAsyncAction = js.native
  /**
    * Asynchronously decrypts static data.
    * @param data Data to decrypt.
    * @return Represents an asynchronous operation.
    */
  def unprotectAsync(data: IBuffer): IPromiseWithIAsyncOperation[IBuffer] = js.native
  /**
    * Asynchronously decrypts a data stream.
    * @param src Stream to decrypt.
    * @param dest Decrypted stream.
    * @return Represents an asynchronous action.
    */
  def unprotectStreamAsync(src: IInputStream, dest: IOutputStream): IPromiseWithIAsyncAction = js.native
}

