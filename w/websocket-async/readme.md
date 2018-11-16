```
// Type definitions for websocket-async 1.3
// Project: https://github.com/jcao219/websocket-async
// Definitions by: Ben O'Sullivan <https://github.com/bigbeno37>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// Typescript Version: 2.7
/**
 * An asynchronous WebSocket client.
 * @example
 * // Set up connection.
 * const webSocketClient = new WebSocketClient;
 * // Connect.
 * await webSocketClient.connect('ws://www.example.com/');
 * // Send is synchronous.
 * webSocketClient.send('Hello!');
 * // Receive is asynchronous.
 * console.log(await webSocketClient.receive());
 * // See if there are any more messages received.
 * if (webSocketClient.dataAvailable !== 0) {
 *     console.log(await webSocketClient.receive());
 * }
 * // Close the connection.
 * await webSocketClient.disconnect();
 */
```