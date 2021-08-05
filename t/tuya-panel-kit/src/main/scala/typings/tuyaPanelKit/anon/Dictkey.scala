package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StringDictionary
import typings.tuyaPanelKit.mod.AnyFunction
import typings.tuyaPanelKit.mod.I18NLanMap
import typings.tuyaPanelKit.mod.MobileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* prop */ StringDictionary[js.Any] {
  
  var activeSubDeviceWithGwId: AnyFunction
  
  var addDeviceToRoom: AnyFunction
  
  var addListener: AnyFunction
  
  var aes128DecryptedStringWithPassword: AnyFunction
  
  var aes128EncryptedStringWithPassword: AnyFunction
  
  var apiRNRequest: AnyFunction
  
  var apiRequest: AnyFunction
  
  var back: AnyFunction
  
  var battery: AnyFunction
  
  var bottomListDialog: AnyFunction
  
  var calculateWhiteModeColor: AnyFunction
  
  var calculationDistance: AnyFunction
  
  var checkUpdate: AnyFunction
  
  var deleteDeviceInfo: AnyFunction
  
  var deviceIsCharging: AnyFunction
  
  var disablePopGesture: AnyFunction
  
  var enablePopGesture: AnyFunction
  
  var evilTransform: AnyFunction
  
  var gcj02ToWgs84Location: AnyFunction
  
  var getBleManagerState: AnyFunction
  
  var getBleRssi: AnyFunction
  
  var getCurrentscreenBrightness: AnyFunction
  
  var getDevInfo: AnyFunction
  
  var getDevProperty: AnyFunction
  
  var getDeviceList: AnyFunction
  
  var getDpDataFromClient: AnyFunction
  
  var getDpDataFromDevice: AnyFunction
  
  var getDpDataFromMeshDevice: AnyFunction
  
  var getDpsWithDevId: AnyFunction
  
  var getMeshDeviceInfoByNodeId: AnyFunction
  
  var getMobileInfo: AnyFunction
  
  var getNetType: AnyFunction
  
  var getNetworkType: AnyFunction
  
  var getPanelInfo: AnyFunction
  
  var getPlayStatus: AnyFunction
  
  var getRoomsInCurrentHome: AnyFunction
  
  var getSubDeviceList: AnyFunction
  
  var getWiFiSsid: AnyFunction
  
  var goToAlarmListActivity: AnyFunction
  
  var gotoBlePermissions: AnyFunction
  
  var gotoDeviceWifiNetworkMonitor: AnyFunction
  
  def gotoDpAlarm(param: Category): Unit
  
  var hideLoading: AnyFunction
  
  var is24Hour: AnyFunction
  
  def jumpTo(routeId: String): js.Any
  
  var lang: I18NLanMap
  
  var mobileInfo: MobileInfo
  
  var panelInfo: IsVDevice
  
  var postBleChannelCommand: AnyFunction
  
  var pushToNextPageWithDeviceId: AnyFunction
  
  var putDpData: AnyFunction
  
  var putLocalDpData: AnyFunction
  
  var putMqttDpData: AnyFunction
  
  var receiverMqttData: AnyFunction
  
  var removeDevice: AnyFunction
  
  var removeGW: AnyFunction
  
  var removeListeners: AnyFunction
  
  var removeSubDevice: AnyFunction
  
  var renameSubDeviceName: AnyFunction
  
  var renameTitle: AnyFunction
  
  var screenAlwaysOn: AnyFunction
  
  var screenBrightness: AnyFunction
  
  var sendMqttData: AnyFunction
  
  var setDevProperty: AnyFunction
  
  var shareMsg: AnyFunction
  
  var shareToSystem: AnyFunction
  
  var showDeviceMenu: AnyFunction
  
  var showEditDialog: AnyFunction
  
  var showLoading: AnyFunction
  
  var simpleConfirmDialog: AnyFunction
  
  var simpleTipDialog: AnyFunction
  
  var startBLEListening: AnyFunction
  
  var startListening: AnyFunction
  
  var stopActiveSubDeviceWithGwId: AnyFunction
  
  var stopListening: AnyFunction
  
  var updateLocation: AnyFunction
}
object Dictkey {
  
  inline def apply(
    activeSubDeviceWithGwId: AnyFunction,
    addDeviceToRoom: AnyFunction,
    addListener: AnyFunction,
    aes128DecryptedStringWithPassword: AnyFunction,
    aes128EncryptedStringWithPassword: AnyFunction,
    apiRNRequest: AnyFunction,
    apiRequest: AnyFunction,
    back: AnyFunction,
    battery: AnyFunction,
    bottomListDialog: AnyFunction,
    calculateWhiteModeColor: AnyFunction,
    calculationDistance: AnyFunction,
    checkUpdate: AnyFunction,
    deleteDeviceInfo: AnyFunction,
    deviceIsCharging: AnyFunction,
    disablePopGesture: AnyFunction,
    enablePopGesture: AnyFunction,
    evilTransform: AnyFunction,
    gcj02ToWgs84Location: AnyFunction,
    getBleManagerState: AnyFunction,
    getBleRssi: AnyFunction,
    getCurrentscreenBrightness: AnyFunction,
    getDevInfo: AnyFunction,
    getDevProperty: AnyFunction,
    getDeviceList: AnyFunction,
    getDpDataFromClient: AnyFunction,
    getDpDataFromDevice: AnyFunction,
    getDpDataFromMeshDevice: AnyFunction,
    getDpsWithDevId: AnyFunction,
    getMeshDeviceInfoByNodeId: AnyFunction,
    getMobileInfo: AnyFunction,
    getNetType: AnyFunction,
    getNetworkType: AnyFunction,
    getPanelInfo: AnyFunction,
    getPlayStatus: AnyFunction,
    getRoomsInCurrentHome: AnyFunction,
    getSubDeviceList: AnyFunction,
    getWiFiSsid: AnyFunction,
    goToAlarmListActivity: AnyFunction,
    gotoBlePermissions: AnyFunction,
    gotoDeviceWifiNetworkMonitor: AnyFunction,
    gotoDpAlarm: Category => Unit,
    hideLoading: AnyFunction,
    is24Hour: AnyFunction,
    jumpTo: String => js.Any,
    lang: I18NLanMap,
    mobileInfo: MobileInfo,
    panelInfo: IsVDevice,
    postBleChannelCommand: AnyFunction,
    pushToNextPageWithDeviceId: AnyFunction,
    putDpData: AnyFunction,
    putLocalDpData: AnyFunction,
    putMqttDpData: AnyFunction,
    receiverMqttData: AnyFunction,
    removeDevice: AnyFunction,
    removeGW: AnyFunction,
    removeListeners: AnyFunction,
    removeSubDevice: AnyFunction,
    renameSubDeviceName: AnyFunction,
    renameTitle: AnyFunction,
    screenAlwaysOn: AnyFunction,
    screenBrightness: AnyFunction,
    sendMqttData: AnyFunction,
    setDevProperty: AnyFunction,
    shareMsg: AnyFunction,
    shareToSystem: AnyFunction,
    showDeviceMenu: AnyFunction,
    showEditDialog: AnyFunction,
    showLoading: AnyFunction,
    simpleConfirmDialog: AnyFunction,
    simpleTipDialog: AnyFunction,
    startBLEListening: AnyFunction,
    startListening: AnyFunction,
    stopActiveSubDeviceWithGwId: AnyFunction,
    stopListening: AnyFunction,
    updateLocation: AnyFunction
  ): Dictkey = {
    val __obj = js.Dynamic.literal(activeSubDeviceWithGwId = activeSubDeviceWithGwId.asInstanceOf[js.Any], addDeviceToRoom = addDeviceToRoom.asInstanceOf[js.Any], addListener = addListener.asInstanceOf[js.Any], aes128DecryptedStringWithPassword = aes128DecryptedStringWithPassword.asInstanceOf[js.Any], aes128EncryptedStringWithPassword = aes128EncryptedStringWithPassword.asInstanceOf[js.Any], apiRNRequest = apiRNRequest.asInstanceOf[js.Any], apiRequest = apiRequest.asInstanceOf[js.Any], back = back.asInstanceOf[js.Any], battery = battery.asInstanceOf[js.Any], bottomListDialog = bottomListDialog.asInstanceOf[js.Any], calculateWhiteModeColor = calculateWhiteModeColor.asInstanceOf[js.Any], calculationDistance = calculationDistance.asInstanceOf[js.Any], checkUpdate = checkUpdate.asInstanceOf[js.Any], deleteDeviceInfo = deleteDeviceInfo.asInstanceOf[js.Any], deviceIsCharging = deviceIsCharging.asInstanceOf[js.Any], disablePopGesture = disablePopGesture.asInstanceOf[js.Any], enablePopGesture = enablePopGesture.asInstanceOf[js.Any], evilTransform = evilTransform.asInstanceOf[js.Any], gcj02ToWgs84Location = gcj02ToWgs84Location.asInstanceOf[js.Any], getBleManagerState = getBleManagerState.asInstanceOf[js.Any], getBleRssi = getBleRssi.asInstanceOf[js.Any], getCurrentscreenBrightness = getCurrentscreenBrightness.asInstanceOf[js.Any], getDevInfo = getDevInfo.asInstanceOf[js.Any], getDevProperty = getDevProperty.asInstanceOf[js.Any], getDeviceList = getDeviceList.asInstanceOf[js.Any], getDpDataFromClient = getDpDataFromClient.asInstanceOf[js.Any], getDpDataFromDevice = getDpDataFromDevice.asInstanceOf[js.Any], getDpDataFromMeshDevice = getDpDataFromMeshDevice.asInstanceOf[js.Any], getDpsWithDevId = getDpsWithDevId.asInstanceOf[js.Any], getMeshDeviceInfoByNodeId = getMeshDeviceInfoByNodeId.asInstanceOf[js.Any], getMobileInfo = getMobileInfo.asInstanceOf[js.Any], getNetType = getNetType.asInstanceOf[js.Any], getNetworkType = getNetworkType.asInstanceOf[js.Any], getPanelInfo = getPanelInfo.asInstanceOf[js.Any], getPlayStatus = getPlayStatus.asInstanceOf[js.Any], getRoomsInCurrentHome = getRoomsInCurrentHome.asInstanceOf[js.Any], getSubDeviceList = getSubDeviceList.asInstanceOf[js.Any], getWiFiSsid = getWiFiSsid.asInstanceOf[js.Any], goToAlarmListActivity = goToAlarmListActivity.asInstanceOf[js.Any], gotoBlePermissions = gotoBlePermissions.asInstanceOf[js.Any], gotoDeviceWifiNetworkMonitor = gotoDeviceWifiNetworkMonitor.asInstanceOf[js.Any], gotoDpAlarm = js.Any.fromFunction1(gotoDpAlarm), hideLoading = hideLoading.asInstanceOf[js.Any], is24Hour = is24Hour.asInstanceOf[js.Any], jumpTo = js.Any.fromFunction1(jumpTo), lang = lang.asInstanceOf[js.Any], mobileInfo = mobileInfo.asInstanceOf[js.Any], panelInfo = panelInfo.asInstanceOf[js.Any], postBleChannelCommand = postBleChannelCommand.asInstanceOf[js.Any], pushToNextPageWithDeviceId = pushToNextPageWithDeviceId.asInstanceOf[js.Any], putDpData = putDpData.asInstanceOf[js.Any], putLocalDpData = putLocalDpData.asInstanceOf[js.Any], putMqttDpData = putMqttDpData.asInstanceOf[js.Any], receiverMqttData = receiverMqttData.asInstanceOf[js.Any], removeDevice = removeDevice.asInstanceOf[js.Any], removeGW = removeGW.asInstanceOf[js.Any], removeListeners = removeListeners.asInstanceOf[js.Any], removeSubDevice = removeSubDevice.asInstanceOf[js.Any], renameSubDeviceName = renameSubDeviceName.asInstanceOf[js.Any], renameTitle = renameTitle.asInstanceOf[js.Any], screenAlwaysOn = screenAlwaysOn.asInstanceOf[js.Any], screenBrightness = screenBrightness.asInstanceOf[js.Any], sendMqttData = sendMqttData.asInstanceOf[js.Any], setDevProperty = setDevProperty.asInstanceOf[js.Any], shareMsg = shareMsg.asInstanceOf[js.Any], shareToSystem = shareToSystem.asInstanceOf[js.Any], showDeviceMenu = showDeviceMenu.asInstanceOf[js.Any], showEditDialog = showEditDialog.asInstanceOf[js.Any], showLoading = showLoading.asInstanceOf[js.Any], simpleConfirmDialog = simpleConfirmDialog.asInstanceOf[js.Any], simpleTipDialog = simpleTipDialog.asInstanceOf[js.Any], startBLEListening = startBLEListening.asInstanceOf[js.Any], startListening = startListening.asInstanceOf[js.Any], stopActiveSubDeviceWithGwId = stopActiveSubDeviceWithGwId.asInstanceOf[js.Any], stopListening = stopListening.asInstanceOf[js.Any], updateLocation = updateLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setActiveSubDeviceWithGwId(value: AnyFunction): Self = StObject.set(x, "activeSubDeviceWithGwId", value.asInstanceOf[js.Any])
    
    inline def setAddDeviceToRoom(value: AnyFunction): Self = StObject.set(x, "addDeviceToRoom", value.asInstanceOf[js.Any])
    
    inline def setAddListener(value: AnyFunction): Self = StObject.set(x, "addListener", value.asInstanceOf[js.Any])
    
    inline def setAes128DecryptedStringWithPassword(value: AnyFunction): Self = StObject.set(x, "aes128DecryptedStringWithPassword", value.asInstanceOf[js.Any])
    
    inline def setAes128EncryptedStringWithPassword(value: AnyFunction): Self = StObject.set(x, "aes128EncryptedStringWithPassword", value.asInstanceOf[js.Any])
    
    inline def setApiRNRequest(value: AnyFunction): Self = StObject.set(x, "apiRNRequest", value.asInstanceOf[js.Any])
    
    inline def setApiRequest(value: AnyFunction): Self = StObject.set(x, "apiRequest", value.asInstanceOf[js.Any])
    
    inline def setBack(value: AnyFunction): Self = StObject.set(x, "back", value.asInstanceOf[js.Any])
    
    inline def setBattery(value: AnyFunction): Self = StObject.set(x, "battery", value.asInstanceOf[js.Any])
    
    inline def setBottomListDialog(value: AnyFunction): Self = StObject.set(x, "bottomListDialog", value.asInstanceOf[js.Any])
    
    inline def setCalculateWhiteModeColor(value: AnyFunction): Self = StObject.set(x, "calculateWhiteModeColor", value.asInstanceOf[js.Any])
    
    inline def setCalculationDistance(value: AnyFunction): Self = StObject.set(x, "calculationDistance", value.asInstanceOf[js.Any])
    
    inline def setCheckUpdate(value: AnyFunction): Self = StObject.set(x, "checkUpdate", value.asInstanceOf[js.Any])
    
    inline def setDeleteDeviceInfo(value: AnyFunction): Self = StObject.set(x, "deleteDeviceInfo", value.asInstanceOf[js.Any])
    
    inline def setDeviceIsCharging(value: AnyFunction): Self = StObject.set(x, "deviceIsCharging", value.asInstanceOf[js.Any])
    
    inline def setDisablePopGesture(value: AnyFunction): Self = StObject.set(x, "disablePopGesture", value.asInstanceOf[js.Any])
    
    inline def setEnablePopGesture(value: AnyFunction): Self = StObject.set(x, "enablePopGesture", value.asInstanceOf[js.Any])
    
    inline def setEvilTransform(value: AnyFunction): Self = StObject.set(x, "evilTransform", value.asInstanceOf[js.Any])
    
    inline def setGcj02ToWgs84Location(value: AnyFunction): Self = StObject.set(x, "gcj02ToWgs84Location", value.asInstanceOf[js.Any])
    
    inline def setGetBleManagerState(value: AnyFunction): Self = StObject.set(x, "getBleManagerState", value.asInstanceOf[js.Any])
    
    inline def setGetBleRssi(value: AnyFunction): Self = StObject.set(x, "getBleRssi", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentscreenBrightness(value: AnyFunction): Self = StObject.set(x, "getCurrentscreenBrightness", value.asInstanceOf[js.Any])
    
    inline def setGetDevInfo(value: AnyFunction): Self = StObject.set(x, "getDevInfo", value.asInstanceOf[js.Any])
    
    inline def setGetDevProperty(value: AnyFunction): Self = StObject.set(x, "getDevProperty", value.asInstanceOf[js.Any])
    
    inline def setGetDeviceList(value: AnyFunction): Self = StObject.set(x, "getDeviceList", value.asInstanceOf[js.Any])
    
    inline def setGetDpDataFromClient(value: AnyFunction): Self = StObject.set(x, "getDpDataFromClient", value.asInstanceOf[js.Any])
    
    inline def setGetDpDataFromDevice(value: AnyFunction): Self = StObject.set(x, "getDpDataFromDevice", value.asInstanceOf[js.Any])
    
    inline def setGetDpDataFromMeshDevice(value: AnyFunction): Self = StObject.set(x, "getDpDataFromMeshDevice", value.asInstanceOf[js.Any])
    
    inline def setGetDpsWithDevId(value: AnyFunction): Self = StObject.set(x, "getDpsWithDevId", value.asInstanceOf[js.Any])
    
    inline def setGetMeshDeviceInfoByNodeId(value: AnyFunction): Self = StObject.set(x, "getMeshDeviceInfoByNodeId", value.asInstanceOf[js.Any])
    
    inline def setGetMobileInfo(value: AnyFunction): Self = StObject.set(x, "getMobileInfo", value.asInstanceOf[js.Any])
    
    inline def setGetNetType(value: AnyFunction): Self = StObject.set(x, "getNetType", value.asInstanceOf[js.Any])
    
    inline def setGetNetworkType(value: AnyFunction): Self = StObject.set(x, "getNetworkType", value.asInstanceOf[js.Any])
    
    inline def setGetPanelInfo(value: AnyFunction): Self = StObject.set(x, "getPanelInfo", value.asInstanceOf[js.Any])
    
    inline def setGetPlayStatus(value: AnyFunction): Self = StObject.set(x, "getPlayStatus", value.asInstanceOf[js.Any])
    
    inline def setGetRoomsInCurrentHome(value: AnyFunction): Self = StObject.set(x, "getRoomsInCurrentHome", value.asInstanceOf[js.Any])
    
    inline def setGetSubDeviceList(value: AnyFunction): Self = StObject.set(x, "getSubDeviceList", value.asInstanceOf[js.Any])
    
    inline def setGetWiFiSsid(value: AnyFunction): Self = StObject.set(x, "getWiFiSsid", value.asInstanceOf[js.Any])
    
    inline def setGoToAlarmListActivity(value: AnyFunction): Self = StObject.set(x, "goToAlarmListActivity", value.asInstanceOf[js.Any])
    
    inline def setGotoBlePermissions(value: AnyFunction): Self = StObject.set(x, "gotoBlePermissions", value.asInstanceOf[js.Any])
    
    inline def setGotoDeviceWifiNetworkMonitor(value: AnyFunction): Self = StObject.set(x, "gotoDeviceWifiNetworkMonitor", value.asInstanceOf[js.Any])
    
    inline def setGotoDpAlarm(value: Category => Unit): Self = StObject.set(x, "gotoDpAlarm", js.Any.fromFunction1(value))
    
    inline def setHideLoading(value: AnyFunction): Self = StObject.set(x, "hideLoading", value.asInstanceOf[js.Any])
    
    inline def setIs24Hour(value: AnyFunction): Self = StObject.set(x, "is24Hour", value.asInstanceOf[js.Any])
    
    inline def setJumpTo(value: String => js.Any): Self = StObject.set(x, "jumpTo", js.Any.fromFunction1(value))
    
    inline def setLang(value: I18NLanMap): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setMobileInfo(value: MobileInfo): Self = StObject.set(x, "mobileInfo", value.asInstanceOf[js.Any])
    
    inline def setPanelInfo(value: IsVDevice): Self = StObject.set(x, "panelInfo", value.asInstanceOf[js.Any])
    
    inline def setPostBleChannelCommand(value: AnyFunction): Self = StObject.set(x, "postBleChannelCommand", value.asInstanceOf[js.Any])
    
    inline def setPushToNextPageWithDeviceId(value: AnyFunction): Self = StObject.set(x, "pushToNextPageWithDeviceId", value.asInstanceOf[js.Any])
    
    inline def setPutDpData(value: AnyFunction): Self = StObject.set(x, "putDpData", value.asInstanceOf[js.Any])
    
    inline def setPutLocalDpData(value: AnyFunction): Self = StObject.set(x, "putLocalDpData", value.asInstanceOf[js.Any])
    
    inline def setPutMqttDpData(value: AnyFunction): Self = StObject.set(x, "putMqttDpData", value.asInstanceOf[js.Any])
    
    inline def setReceiverMqttData(value: AnyFunction): Self = StObject.set(x, "receiverMqttData", value.asInstanceOf[js.Any])
    
    inline def setRemoveDevice(value: AnyFunction): Self = StObject.set(x, "removeDevice", value.asInstanceOf[js.Any])
    
    inline def setRemoveGW(value: AnyFunction): Self = StObject.set(x, "removeGW", value.asInstanceOf[js.Any])
    
    inline def setRemoveListeners(value: AnyFunction): Self = StObject.set(x, "removeListeners", value.asInstanceOf[js.Any])
    
    inline def setRemoveSubDevice(value: AnyFunction): Self = StObject.set(x, "removeSubDevice", value.asInstanceOf[js.Any])
    
    inline def setRenameSubDeviceName(value: AnyFunction): Self = StObject.set(x, "renameSubDeviceName", value.asInstanceOf[js.Any])
    
    inline def setRenameTitle(value: AnyFunction): Self = StObject.set(x, "renameTitle", value.asInstanceOf[js.Any])
    
    inline def setScreenAlwaysOn(value: AnyFunction): Self = StObject.set(x, "screenAlwaysOn", value.asInstanceOf[js.Any])
    
    inline def setScreenBrightness(value: AnyFunction): Self = StObject.set(x, "screenBrightness", value.asInstanceOf[js.Any])
    
    inline def setSendMqttData(value: AnyFunction): Self = StObject.set(x, "sendMqttData", value.asInstanceOf[js.Any])
    
    inline def setSetDevProperty(value: AnyFunction): Self = StObject.set(x, "setDevProperty", value.asInstanceOf[js.Any])
    
    inline def setShareMsg(value: AnyFunction): Self = StObject.set(x, "shareMsg", value.asInstanceOf[js.Any])
    
    inline def setShareToSystem(value: AnyFunction): Self = StObject.set(x, "shareToSystem", value.asInstanceOf[js.Any])
    
    inline def setShowDeviceMenu(value: AnyFunction): Self = StObject.set(x, "showDeviceMenu", value.asInstanceOf[js.Any])
    
    inline def setShowEditDialog(value: AnyFunction): Self = StObject.set(x, "showEditDialog", value.asInstanceOf[js.Any])
    
    inline def setShowLoading(value: AnyFunction): Self = StObject.set(x, "showLoading", value.asInstanceOf[js.Any])
    
    inline def setSimpleConfirmDialog(value: AnyFunction): Self = StObject.set(x, "simpleConfirmDialog", value.asInstanceOf[js.Any])
    
    inline def setSimpleTipDialog(value: AnyFunction): Self = StObject.set(x, "simpleTipDialog", value.asInstanceOf[js.Any])
    
    inline def setStartBLEListening(value: AnyFunction): Self = StObject.set(x, "startBLEListening", value.asInstanceOf[js.Any])
    
    inline def setStartListening(value: AnyFunction): Self = StObject.set(x, "startListening", value.asInstanceOf[js.Any])
    
    inline def setStopActiveSubDeviceWithGwId(value: AnyFunction): Self = StObject.set(x, "stopActiveSubDeviceWithGwId", value.asInstanceOf[js.Any])
    
    inline def setStopListening(value: AnyFunction): Self = StObject.set(x, "stopListening", value.asInstanceOf[js.Any])
    
    inline def setUpdateLocation(value: AnyFunction): Self = StObject.set(x, "updateLocation", value.asInstanceOf[js.Any])
  }
}
