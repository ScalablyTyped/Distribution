package typings.webDashPush.webDashPushMod

import typings.node.Buffer
import typings.webDashPush.Anon_Authorization
import typings.webDashPush.Anon_AuthorizationCryptoKey
import typings.webDashPush.Anon_AuthorizationCryptoKeyString
import typings.webDashPush.Anon_Body
import typings.webDashPush.Anon_BodyBuffer
import typings.webDashPush.webDashPushStrings.aes128gcm
import typings.webDashPush.webDashPushStrings.aesgcm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web-push", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def encrypt(userPublicKey: String, userAuth: String, payload: String, contentEncoding: ContentEncoding): EncryptionResult = js.native
  def encrypt(userPublicKey: String, userAuth: String, payload: Buffer, contentEncoding: ContentEncoding): EncryptionResult = js.native
  def generateRequestDetails(subscription: PushSubscription): RequestDetails with Anon_Body = js.native
  def generateRequestDetails(subscription: PushSubscription, payload: String): RequestDetails with Anon_BodyBuffer = js.native
  def generateRequestDetails(subscription: PushSubscription, payload: String, options: RequestOptions): RequestDetails with Anon_BodyBuffer = js.native
  def generateRequestDetails(subscription: PushSubscription, payload: Null, options: RequestOptions): RequestDetails with Anon_Body = js.native
  def generateRequestDetails(subscription: PushSubscription, payload: Buffer): RequestDetails with Anon_BodyBuffer = js.native
  def generateRequestDetails(subscription: PushSubscription, payload: Buffer, options: RequestOptions): RequestDetails with Anon_BodyBuffer = js.native
  @JSName("generateRequestDetails")
  def generateRequestDetails_RequestDetails(subscription: PushSubscription): RequestDetails = js.native
  @JSName("generateRequestDetails")
  def generateRequestDetails_RequestDetails(subscription: PushSubscription, payload: String): RequestDetails = js.native
  @JSName("generateRequestDetails")
  def generateRequestDetails_RequestDetails(subscription: PushSubscription, payload: String, options: RequestOptions): RequestDetails = js.native
  @JSName("generateRequestDetails")
  def generateRequestDetails_RequestDetails(subscription: PushSubscription, payload: Buffer): RequestDetails = js.native
  @JSName("generateRequestDetails")
  def generateRequestDetails_RequestDetails(subscription: PushSubscription, payload: Buffer, options: RequestOptions): RequestDetails = js.native
  def generateVAPIDKeys(): VapidKeys = js.native
  def getVapidHeaders(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: ContentEncoding
  ): Anon_AuthorizationCryptoKeyString = js.native
  def getVapidHeaders(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: ContentEncoding,
    expiration: Double
  ): Anon_AuthorizationCryptoKeyString = js.native
  @JSName("getVapidHeaders")
  def getVapidHeaders_aes128gcm(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: aes128gcm
  ): Anon_Authorization = js.native
  @JSName("getVapidHeaders")
  def getVapidHeaders_aes128gcm(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: aes128gcm,
    expiration: Double
  ): Anon_Authorization = js.native
  @JSName("getVapidHeaders")
  def getVapidHeaders_aesgcm(audience: String, subject: String, publicKey: String, privateKey: String, contentEncoding: aesgcm): Anon_AuthorizationCryptoKey = js.native
  @JSName("getVapidHeaders")
  def getVapidHeaders_aesgcm(
    audience: String,
    subject: String,
    publicKey: String,
    privateKey: String,
    contentEncoding: aesgcm,
    expiration: Double
  ): Anon_AuthorizationCryptoKey = js.native
  def sendNotification(subscription: PushSubscription): js.Promise[SendResult] = js.native
  def sendNotification(subscription: PushSubscription, payload: String): js.Promise[SendResult] = js.native
  def sendNotification(subscription: PushSubscription, payload: String, options: RequestOptions): js.Promise[SendResult] = js.native
  def sendNotification(subscription: PushSubscription, payload: Null, options: RequestOptions): js.Promise[SendResult] = js.native
  def sendNotification(subscription: PushSubscription, payload: Buffer): js.Promise[SendResult] = js.native
  def sendNotification(subscription: PushSubscription, payload: Buffer, options: RequestOptions): js.Promise[SendResult] = js.native
  def setGCMAPIKey(): Unit = js.native
  def setGCMAPIKey(apiKey: String): Unit = js.native
  def setVapidDetails(subject: String, publicKey: String, privateKey: String): Unit = js.native
}

