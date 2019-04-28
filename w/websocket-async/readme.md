
# Scala.js typings for websocket-async

Typings are for version 1.3

## Library description:
An async/await WebSocket client for browsers

|                    |                 |
| ------------------ | :-------------: |
| Full name          | websocket-async |
| Keywords           | - |
| # releases         | 7 |
| # dependents       | 1 |
| # downloads        | 950 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/jcao219/websocket-async#readme)
- [Bugs](https://github.com/jcao219/websocket-async/issues)
- [Repository](https://github.com/jcao219/websocket-async)
- [Npm](https://www.npmjs.com/package/websocket-async)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
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

